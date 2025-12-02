# **Smart E-Commerce Platform**

### *Full-Stack · Spring Boot · Vue.js · JWT · AI Recommendation · Geolocation API*

Modern, scalable e-commerce platform built with:

* **Spring Boot 3** (REST API · Clean Architecture · JWT Security)
* **Vue.js 3** (SPA frontend)
* **Python AI microservice** (product recommendation)
* **Geolocation API integration** (OpenStreetMap / Google Maps)
* **PostgreSQL or MySQL database**
* **Swagger documentation**
* **Docker-ready architecture**

---

## 🚀 Features

### 🛒 Core E-Commerce

* Product catalog (CRUD, search, pagination)
* Shopping cart (add / update / remove / total)
* Checkout + order lifecycle (Pending → Paid → Shipped → Delivered)
* Stock management

### 👤 Users & Security

* JWT authentication
* Role-based access (USER / ADMIN)
* Profile and address management

### 🤖 AI Recommendation Engine

* Purchase-history based recommender
* Flask microservice (Python)
* Similarity scoring + ranking

### 🌍 API Externe (Géolocalisation)

* Nearby pickup points
* Location-based promotion suggestions

---

## 🧱 Architecture

```
smart-ecommerce-platform/
 ├── backend/        # Spring Boot REST API
 ├── frontend/       # Vue.js SPA
 ├── ai-service/     # Python Flask ML microservice
 ├── docs/           # UML, screenshots, architecture
 ├── README.md
 └── .gitignore
```

---

## 🔧 Technologies

| Layer    | Tech                                                |
| -------- |-----------------------------------------------------|
| Backend  | Spring Boot · Spring Security · JWT · JPA · Swagger |
| Frontend | Vue.js · Pinia · Axios · Tailwind or Bootstrap      |
| Database | PostgreSQL / MySQL                                  |
| AI       | Python · Flask · Pandas · Scikit-Learn              |
| DevOps   | Docker · GitHub Actions (CI/CD)                     |

---

## 📚 Documentation

Will include:

* Swagger API documentation
* UML architecture diagrams
* Database schema
* Sequence diagrams

---

## 🐳 Docker Ready

Future release will include:

* `docker-compose.yml`
* Backend container
* Frontend container
* AI microservice container
* Database container
