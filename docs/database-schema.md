## **Modèle de Données – Smart E-Commerce Platform**

## 1. Tables principales

### **Users**

| Champ    | Type              | Description |
| -------- | ----------------- | ----------- |
| id       | BIGINT            | PK          |
| email    | VARCHAR           | unique      |
| password | VARCHAR           | hash        |
| role     | ENUM(USER, ADMIN) |             |

---

### **Products**

| Champ       | Type    | Description |
| ----------- | ------- | ----------- |
| id          | BIGINT  | **PK**      |
| name        | VARCHAR | unique      |
| description | TEXT    |             |
| price       | DECIMAL |             |
| stock       | INT     |             |
| category    | VARCHAR |             |
| image_url   | VARCHAR |             |

---

### **Orders**

| Champ      | Type                                         | Description       |
| ---------- | -------------------------------------------- | ----------------- |
| id         | BIGINT                                       | **PK**            |
| user_id    | BIGINT                                       | **FK → Users.id** |
| total      | DECIMAL                                      |                   |
| status     | ENUM('PENDING','PAID','SHIPPED','DELIVERED') |                   |
| created_at | TIMESTAMP                                    |                   |

---

### **OrderItems**

Comme une ligne correspond à **un produit dans une commande**, la clé primaire est composée :

| Champ      | Type    | Description          |
| ---------- | ------- |----------------------|
| order_id   | BIGINT  | **FK → Orders.id**   |
| product_id | BIGINT  | **FK → Products.id** |
| quantity   | INT     |                      |
| price      | DECIMAL | unique               |

 **PK(order_id, product_id)**

---

###  **Reviews**

| Champ      | Type   | Description          |
| ---------- | ------ | -------------------- |
| id         | BIGINT | **PK**               |
| user_id    | BIGINT | **FK → Users.id**    |
| product_id | BIGINT | **FK → Products.id** |
| rating     | INT    | (1–5)                |
| comment    | TEXT   |                      |

---

### Relation globale

```
User (1) --- (N) Order (1) --- (N) OrderItem (N) --- (1) Product
User (1) --- (N) Review (N) --- (1) Product
```
