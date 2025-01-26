# E-Commerce Web Application

## Table of Contents
- [Project Description](#project-description)
- [Features](#features)
  - [Administrator Features](#administrator-features)
  - [Customer Features](#customer-features)
- [Technologies Used](#technologies-used)
- [Database Schema](#database-schema)
- [Setup Instructions](#setup-instructions)
- [Screenshots](#screenshots)
- [Demonstration Video](#demonstration-video)
- [Bonus Features](#bonus-features)
- [Evaluation Criteria](#evaluation-criteria)
- [License](#license)

---

## Project Description
This is a full-featured **E-Commerce Web Application** developed using **JavaEE, JDBC Connection Pooling, and JSP**. The application provides an interactive platform for users to browse and purchase products while allowing administrators to manage the products, categories, orders, and users efficiently.

## Features

### Administrator Features:
- **Product Management**: Add, view, update, and delete products.
- **Category Management**: Add, view, update, and delete product categories.
- **Order Management**: View all orders placed by customers.
- **User Management**: View, activate, or deactivate customer accounts.

### Customer Features:
- **User Authentication**: Register, login, and logout.
- **Product Browsing**: View products by category, search by name, and sort by price.
- **Shopping Cart**: Add products to the cart, update quantities, and remove products.
- **Order Placement**: Place orders and view order history.
- **User Profile Management**: Update personal information and password.

## Technologies Used
- **Backend**: JavaEE, Servlets, JSP
- **Database**: MySQL
- **Connection Pooling**: Apache DBCP / HikariCP / Tomcat Connection Pool
- **Front-end**: JSP, HTML, CSS, Bootstrap (optional)
- **Server**: Apache Tomcat
- **Version Control**: Git & GitHub

## Database Schema
### Tables:
- `products`
- `categories`
- `users`
- `orders`
- `order_details`
- `cart`

## Setup Instructions
### Prerequisites:
1. Install **JDK 8+**
2. Install **Apache Tomcat 9+**
3. Install **MySQL Server**
4. Install **IntelliJ IDEA / Eclipse** (for development)

### Steps:
1. Clone the repository:
   ```bash
   git clone <repository_url>
   cd e-commerce-javaee
   ```
2. Create the MySQL database:
   ```sql
   CREATE DATABASE ecommerce;
   ```
3. Import the database schema from `ecommerce.sql`
4. Configure `context.xml` for **JDBC Connection Pooling**
5. Deploy the project on **Tomcat Server**
6. Access the application via `http://localhost:8080/ecommerce`
 
Demonstration Video
Check out the full application demo on YouTube: **[Demo Video Link](#)**

##Screenshots
![image alt](https://github.com/oshanshanuka/ECommerce-POS/blob/7a68402ba3b706d0e1394428b2ca94447ab9f621/Screenshot%20(131).png)
![image alt](https://github.com/oshanshanuka/ECommerce-POS/blob/b47bd6075bae5cf560e1910f3dd9d1242bc3c75e/Screenshot%20(137).png)

## Bonus Features
- Advanced search with filters (by price range, category, or keywords)
- Role-based access control (Admin & Customer roles)
- AJAX-based cart updates and product search

## Evaluation Criteria
- Application functionality
- Code quality and structure
- Efficient use of JDBC connection pooling
- User interface and design


Enjoy building and using this E-Commerce Web Application! 🚀

