# My-DevOps

A collection of DevOps automation projects demonstrating **CI/CD pipelines, containerization, Jenkins pipeline scripting, and secure infrastructure automation**.

## Projects
- [CICD-NodeDB-Docker](./CICD-NodeDB-Docker) – Node.js + MongoDB app with Docker Compose & Docker networking, Jenkins pipeline (Groovy), and persistent volumes.
- [CICD-nginx-Docker](./CICD-nginx-Docker) – Nginx deployment pipeline with Jenkins agent setup and SSH authentication.

## Key Objectives
- **Jenkins Pipeline (Groovy):** Declarative + scripted pipelines, job DSL, parameterized builds.
- **Agent Setup:** Configured Jenkins agents via SSH, secured authentication, and workspace isolation.
- **Docker Compose:** Multi-service orchestration (Node.js, MongoDB, Nginx).
- **Volumes:** Persistent storage for MongoDB and app data.
- **Networking:** Bridge networks for container communication; host mapping for external access.
- **CI/CD Automation:** Automated builds, tests, and deployments triggered via Jenkins.
- **Secure Practices:** `.env` injection, avoiding hardcoded secrets, SSH key-based authentication.

---

### 🚀 Getting Started
```bash
git clone https://github.com/Johnson-S1/My-DevOps.git
cd My-DevOps
