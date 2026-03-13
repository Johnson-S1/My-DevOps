
---

## 📄 Project README – `CICD-nginx-Docker/README.md`

```markdown
# CICD-nginx-Docker

An **Nginx-based deployment pipeline** showcasing Jenkins automation, Docker networking, and secure agent setup.

## Objectives
- Nginx container with custom configuration.
- Jenkins pipeline scripted in **Groovy**:
  - Automated build and deploy
  - Parameterized jobs
  - Agent setup via SSH
- Docker networking:
  - **Bridge network** for container communication
  - Host mapping for external access
- CI/CD pipeline integrated with GitHub repo commits.

## Setup
```bash
cd CICD-nginx-Docker
docker build -t nginx-app .
docker run -p 8080:80 nginx-app
