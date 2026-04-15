<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/0ae8472b-bd91-495c-a038-ef9d1c4c954b" />🛒 SmartShop – Cloud-Native E-Commerce Platform

🚀 Production-Style Microservices | ⚙️ DevOps Pipeline | ☸️ Kubernetes Deployment
---

📌 Overview

SmartShop is a cloud-native microservices-based e-commerce platform** built to simulate real-world DevOps workflows.

This project demonstrates:

🔁 End-to-end CI/CD automation
🐳 Docker-based containerization
☸️ Kubernetes deployment
☁️ Cloud-ready architecture

---
Flow
User → API Gateway → Microservices → Docker → Kubernetes → AWS
---
⚙️ Tech Stack

| Layer            | Technology        |
| ---------------- | ----------------- |
| 💻 Backend       | Java, Spring Boot |
| 🔨 Build Tool    | Maven             |
| 🐳 Container     | Docker            |
| ☸️ Orchestration | Kubernetes        |
| 🔁 CI/CD         | Jenkins           |
| ☁️ Cloud         | AWS (ECR, EC2)    |
| 🐧 OS            | Linux             |

---
 🧩 Microservices

| Service             | Endpoint    |
| ------------------- | ----------- |
| 👤 User Service     | `/users`    |
| 🛍️ Product Service | `/products` |
| 📦 Order Service    | `/orders`   |

---

🔄 CI/CD Pipeline
GitHub → Jenkins → Maven Build → Docker Build → Kubernetes Deploy
---

 Live Execution Proof
🐳 Docker Images
---
☸️ Kubernetes Pods
---
🌐 Application Output
---

🚀 Getting Started
# Clone Repository
git clone https://github.com/YOUR_USERNAME/smartshop.git

# Build Services
mvn clean package

# Build Docker Images
docker build -t user-service ./user-service

# Deploy to Kubernetes
kubectl apply -f k8s/

---

📦 Project Structure
smartshop/
├── user-service/
├── product-service/
├── order-service/
├── k8s/
├── jenkins/
├── screenshots/
├── architecture.png
└── README.md
---
🎯 Key Highlights

* ✅ Microservices Architecture
* ✅ CI/CD Pipeline Automation
* ✅ Docker + Kubernetes Integration
* ✅ Cloud Deployment Ready
* ✅ Real Execution Proof

---
🧠 Learning Outcomes

* DevOps pipeline implementation
* Kubernetes deployments
* Docker lifecycle management
* Microservices architecture
* Cloud-native application design
---
👨‍💻 Author
Apurva Solanke
