pipeline {

    agent Hat
      environment {
         APP_NAME="nginx:v1"
         CON_NAME="deploy:V1" 
       }  
         stages {
            
            stage('git-pull') {
                 steps {
                  echo 'Pulling code form git scm'
                  checkout scm
                  }
            }

         stage('Building-Docker') {
              steps {
              echo 'Building Docker Image From Github REPO DOCKER FILE'
              sshagent(['cent-key']) {
              sh 'scp /home/root/"$WORKSPACE"/* root@cent:/home/root/jenk/'
              sh 'docker build -t "$APP_NAME"  ./$WORKSPACE/Docker'
              sh 'docker stop "$APP_NAME" || true && docker rm "$APP_NAME" || true
              sh 'docker run -d --name "$CON_NAME" -p 8080:80 "$APP_NAME"
              }
        } 
   }
}
        post {
           
            success {
                   echo "DEPLOYMENT HAS BEEN SUCCESSFULLY FINISHED" 
             }
             
            failure {
                   echo "DEPLOYMENT IS NOT FINISHED"
                   sh 'tail -n 20 /var/log/jenkins/jenkins.log'
             }
            cleanup {
                 cleanws()  
                 echo 'Workspace has been successfully wiped'
            }
        }
}  
