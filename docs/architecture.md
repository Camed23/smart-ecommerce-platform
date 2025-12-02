
## **Architecture Technique – Smart E-Commerce Platform**

## 1. Vue d’ensemble

L’architecture générale repose sur **3 services principaux** :

```
                      ┌──────────────────────────────┐
                      │        Frontend Vue.js         │
                      │  (SPA · Axios · Authentication)│
                      └──────────────┬─────────────────┘
                                     │
                                     ▼
                    ┌────────────────────────────────────┐
                    │      Backend Spring Boot (API)      │
                    │  - Products                         │
                    │  - Orders                           │
                    │  - Cart                             │
                    │  - Reviews                          │
                    │  - Auth (JWT)                       │
                    │  - Locations (API Externe)          │
                    └──────────────┬──────────────────────┘
                                   │ REST
                                   ▼
                       ┌─────────────────────┐
                       │  Microservice IA    │
                       │ (Python + Flask)    │
                       │ Recommendations     │
                       └─────────────────────┘

```

## 2. Composants

### Backend Spring Boot

* REST API
* Validation
* Spring Security (JWT)
* JPA (MySQL/PostgreSQL)

### Frontend Vue.js

* SPA
* Pinia (store global)
* Axios
* TailwindCSS

###  Microservice IA

* Flask
* Scikit-Learn
* Recommandations personnalisées

### Base de données

* MySQL/PostgreSQL
* Utilisée uniquement par le backend

### API externe

* OpenStreetMap ou Google Maps
* Recherches géographiques
* Points de retrait