pipeline {

    agent {label 'Hat'}
      environment {
         APP_NAME="Nginx:v1"
         CON_NAME="Deploy:V1" 
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
              sh """
              scp ./* root@cent:/home/root/jenk/
              ssh -o StrickHostKeyChecking=no  root@cent "
              cd /home/root/jenk/
              docker build -t "$APP_NAME" -f Dockerfile . 
              docker stop "$CON_NAME" || true && docker rm "$CON_NAME" || true
              docker run -d --name "$CON_NAME" -p 8080:80 "$APP_NAME"
              "
              """
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
                   sh "tail -n 20 /var/log/jenkins/jenkins.log"
             }
            cleanup {
                 cleanWs()  
                 echo 'Workspace has been successfully wiped'
            }
        }
}  
