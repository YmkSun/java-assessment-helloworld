CREATE DATABASE helloworld_db;
USE helloworld_db;

CREATE TABLE messages (
    id INT AUTO_INCREMENT PRIMARY KEY,
    text VARCHAR(300)
);

INSERT INTO messages (text) VALUES ('TEST');