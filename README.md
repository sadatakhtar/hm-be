# 📖 API Documentation - Homemade 

This section provides an overview of the API endpoints for the Homemade Food Marketplace application. It includes endpoints for user authentication, product management, orders, payments, and more.

## 🗝️ **1. Authentication Endpoints**

| HTTP Method | Endpoint           | Description                                   |
|-------------|--------------------|-----------------------------------------------|
| `POST`      | `/api/auth/signup` | Register a new user (buyer or seller)         |
| `POST`      | `/api/auth/login`  | Authenticate user and return JWT token        |
| `POST`      | `/api/auth/logout` | Invalidate user session/token                 |

## 👤 **2. User Endpoints**

| HTTP Method | Endpoint            | Description                       |
|-------------|---------------------|-----------------------------------|
| `GET`       | `/api/users`        | Get all users (Admin only)        |
| `GET`       | `/api/users/{id}`   | Get user details by ID            |
| `PUT`       | `/api/users/{id}`   | Update user profile               |
| `DELETE`    | `/api/users/{id}`   | Delete user (Admin only)          |

## 🗂️ **3. Category Endpoints**

| HTTP Method | Endpoint                | Description                    |
|-------------|-------------------------|--------------------------------|
| `GET`       | `/api/categories`       | Get all categories             |
| `POST`      | `/api/categories`       | Create a new category (Admin)  |
| `PUT`       | `/api/categories/{id}`  | Update category (Admin)        |
| `DELETE`    | `/api/categories/{id}`  | Delete category (Admin)        |

## 🍲 **4. Product Endpoints**

| HTTP Method | Endpoint                          | Description                             |
|-------------|-----------------------------------|-----------------------------------------|
| `GET`       | `/api/products`                   | Get all products                        |
| `GET`       | `/api/products/{id}`              | Get product details by ID               |
| `POST`      | `/api/products`                   | Create a new product (Seller only)      |
| `PUT`       | `/api/products/{id}`              | Update product details (Seller only)    |
| `DELETE`    | `/api/products/{id}`              | Delete product (Seller only)            |
| `GET`       | `/api/products/category/{categoryId}` | Get products by category           |
| `GET`       | `/api/products/search?query={query}` | Search products by name/description |

## 📦 **5. Address Endpoints**

| HTTP Method | Endpoint               | Description                    |
|-------------|------------------------|--------------------------------|
| `GET`       | `/api/addresses`       | Get all addresses for user     |
| `POST`      | `/api/addresses`       | Add a new address for user     |
| `PUT`       | `/api/addresses/{id}`  | Update user address            |
| `DELETE`    | `/api/addresses/{id}`  | Delete user address            |

## 🛒 **6. Order Endpoints**

| HTTP Method | Endpoint                         | Description                              |
|-------------|----------------------------------|------------------------------------------|
| `GET`       | `/api/orders`                    | Get all orders (Admin/Seller)            |
| `GET`       | `/api/orders/user/{userId}`      | Get all orders for a specific user       |
| `GET`       | `/api/orders/{orderId}`          | Get order details by ID                  |
| `POST`      | `/api/orders`                    | Create a new order (Buyer only)          |
| `PUT`       | `/api/orders/{orderId}`          | Update order status (Seller/Admin only)  |
| `DELETE`    | `/api/orders/{orderId}`          | Cancel order (Buyer/Admin only)          |

## 🛍️ **7. Order Item Endpoints**

| HTTP Method | Endpoint                                  | Description                              |
|-------------|-------------------------------------------|------------------------------------------|
| `GET`       | `/api/orders/{orderId}/items`             | Get all items in a specific order        |
| `POST`      | `/api/orders/{orderId}/items`             | Add item to an order (upon creation)     |
| `DELETE`    | `/api/orders/{orderId}/items/{itemId}`    | Remove an item from an order (Admin only)|

## ⭐ **8. Review Endpoints**

| HTTP Method | Endpoint                     | Description                              |
|-------------|------------------------------|------------------------------------------|
| `GET`       | `/api/reviews`               | Get all reviews                          |
| `GET`       | `/api/reviews/product/{productId}` | Get all reviews for a product       |
| `POST`      | `/api/reviews`               | Add a new review for a product           |
| `PUT`       | `/api/reviews/{reviewId}`    | Update a review (User only)              |
| `DELETE`    | `/api/reviews/{reviewId}`    | Delete a review (User/Admin only)        |

## 💳 **9. Payment Endpoints**

| HTTP Method | Endpoint                | Description                              |
|-------------|-------------------------|------------------------------------------|
| `GET`       | `/api/payments`         | Get all payment methods for a user       |
| `POST`      | `/api/payments`         | Add a new payment method                 |
| `DELETE`    | `/api/payments/{paymentId}` | Delete a payment method               |

## 💰 **10. Transaction Endpoints**

| HTTP Method | Endpoint                               | Description                              |
|-------------|----------------------------------------|------------------------------------------|
| `GET`       | `/api/transactions`                    | Get all transactions (Admin only)        |
| `GET`       | `/api/transactions/{id}`               | Get transaction details by ID            |
| `POST`      | `/api/transactions`                    | Create a new transaction record          |
| `GET`       | `/api/orders/{orderId}/transaction`    | Get transaction details for an order     |

## 🔒 **Security Considerations**
- **Authentication**: Implement JWT-based authentication for protected routes.
- **Role-Based Access Control**: Manage access using roles (`buyer`, `seller`, `admin`).
- **Data Validation**: Validate input to prevent SQL injection and other attacks.
- **Password Security**: Store passwords securely using bcrypt.

## 🚀 **Future Enhancements**
- **Notifications**: Real-time notifications for order updates using WebSockets.
- **Order Tracking**: Integrate shipment tracking for delivery services.
- **Admin Dashboard**: Create endpoints for admin functionalities like user management, reports, and analytics.

