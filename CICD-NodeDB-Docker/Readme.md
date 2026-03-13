
---

## 📄 Project README – `CICD-NodeDB-Docker/README.md`

# CICD-NodeDB-Docker

A **Node.js + MongoDB application** deployed with Docker Compose and automated via Jenkins pipeline.

## Objectives
- Node.js backend containerized with Docker.
- MongoDB service with **persistent volumes** for data durability.
- Jenkins pipeline scripted in **Groovy**:
  - Build → Test → Deploy stages
  - Environment variable injection
  - Agent allocation via SSH
- Docker networking (bridge) for inter-container communication.
- CI/CD automation triggered on code commits.

## Setup
```bash
cd CICD-NodeDB-Docker
docker-compose up -d
