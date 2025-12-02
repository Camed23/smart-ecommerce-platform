## **Cas d’usage – Smart E-Commerce Platform**

### 1. Utilisateurs (USER)

- Créer un compte
- Se connecter (JWT)
- Se déconnecter
- Consulter la liste des produits
- Filtrer / rechercher des produits
- Consulter le détail d’un produit
- Ajouter un produit au panier
- Modifier la quantité dans le panier
- Supprimer un produit du panier
- Vider entièrement le panier
- Passer une commande
- Consulter l’historique de ses commandes
- Consulter le détail d’une commande
- Laisser un avis sur un produit acheté
- Mettre à jour les informations de son profil (nom, email, adresse)
- Supprimer son compte (fermeture définitive du compte utilisateur)
- Recevoir des recommandations de produits (IA)
- Trouver des points de retrait proches via la géolocalisation

---

### 2. Administrateurs (ADMIN)

- Se connecter à l’espace d’administration
- Ajouter un produit
- Modifier un produit (prix, description, stock, image…)
- Supprimer un produit
- Gérer les stocks (réassort, mise à jour manuelle)
- Consulter la liste des commandes de tous les utilisateurs
- Mettre à jour le statut d’une commande (PENDING → PAID → SHIPPED → DELIVERED)
- Consulter les avis clients sur les produits
- Désactiver / bannir temporairement un utilisateur (optionnel)
- Consulter des statistiques (ventes, produits populaires…) (optionnel)

---

### 3. Microservice IA (Service de recommandation)

- Recevoir un appel du backend : `/recommend?userId=X`
- Analyser l’historique d’achats d’un utilisateur
- Calculer des similarités entre produits / catégories
- Retourner une liste de produits recommandés avec un score de pertinence

---

### 4. Service de géolocalisation (API externe)

- Recevoir un appel du backend avec une ville ou des coordonnées GPS
- Retourner des points de retrait proches (adresses + coordonnées)
- Fournir des informations pour l’affichage des points de retrait dans le frontend
