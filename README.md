# Inventory Management System README

## Objective
Develop a backend service for an inventory management system that facilitates operations like adding, updating, deleting, and querying inventory items efficiently.

## Requirements

### 1. Inventory Item Operations
- Implement CRUD (Create, Read, Update, Delete) operations for inventory items.
- Each item should include attributes such as ID, name, description, price, and quantity in stock.

### 2. Search Functionality
- Implement a search endpoint (`GET /items/search?term={search_term}`) to allow users to find items by name or description.

### 3. Category Management
- Items should be categorizable (e.g., electronics, clothing, groceries).
- Provide an endpoint (`GET /items/category/{category}`) to retrieve items by their category.

### 4. Price Adjustment
- Implement an endpoint (`POST /items/adjust-price`) to adjust the price of items in a category by a specified percentage (increase or decrease).

### 5. Database Integration
- Design and utilize a database schema for storing inventory items and their respective categories.

## API

### Endpoint Details

#### `POST /items`
- **Description:** Add a new item to the inventory.
- **Request Body:** JSON object containing item details (name, description, price, quantity, category).
- **Response:** JSON response confirming the addition of the item.

#### `GET /items//getById/{id}`
- **Description:** Retrieve an item by its ID.
- **Response:** JSON object containing details of the requested item.

#### `PUT /items/updateById/{id}`
- **Description:** Update an existing item by its ID.
- **Request Body:** JSON object containing updated item details (name, description, price, quantity, category).
- **Response:** JSON response confirming the update of the item.

#### `DELETE /items/deleteById/{id}`
- **Description:** Delete an item by its ID.
- **Response:** JSON response confirming the deletion of the item.

#### `GET /items/search?term={search_term}`
- **Description:** Search for items by name or description using a search term.
- **Response:** JSON array containing items that match the search criteria.

#### `GET /items/category/{category}`
- **Description:** Retrieve items belonging to a specific category.
- **Response:** JSON array containing items categorized under the specified category.

#### `POST /items/adjust-price`
- **Description:** Adjust the prices of items in a category by a specified percentage.
- **Request Body:** JSON object containing category name and percentage adjustment (positive or negative).
- **Response:** JSON response confirming the price adjustment operation.

---
