-- Migration script for creating users and products tables

CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(255) NOT NULL,
                       first_name VARCHAR(255),
                       last_name VARCHAR(255),
                       email VARCHAR(255),
                       address VARCHAR(255),
                       cellphone VARCHAR(20),
                       password VARCHAR(255),
                       user_type VARCHAR(50),
                       date_created DATETIME,
                       CONSTRAINT UK_email UNIQUE (email)
);

CREATE TABLE products (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          code VARCHAR(255) NOT NULL,
                          name VARCHAR(255),
                          description TEXT,
                          image VARCHAR(255),
                          price DECIMAL(10, 2),
                          date_created DATETIME,
                          date_updated DATETIME,
                          user_entity_id INT,
                          CONSTRAINT FK_user_entity FOREIGN KEY (user_entity_id) REFERENCES users(id)
);
