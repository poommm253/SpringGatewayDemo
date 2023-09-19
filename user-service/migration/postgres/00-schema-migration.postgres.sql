-- liquibase formatted sql

-- changeset poommmm253:1
CREATE TABLE "user"(id SERIAL NOT NULL PRIMARY KEY, user_id VARCHAR(36) NOT NULL UNIQUE, first_name VARCHAR(255) NOT NULL, last_name VARCHAR(255) NOT NULL, email VARCHAR(255) UNIQUE NOT NULL, created_date TIMESTAMP WITH TIME ZONE NOT NULL, updated_date TIMESTAMP WITH TIME ZONE NOT NULL, enabled BOOLEAN NOT NULL);

-- changeset poommm253:2
INSERT INTO "user" (user_id, first_name, last_name, email, created_date, updated_date, enabled) VALUES ('1234', 'Poom', 'C', 'example@gmail.com', '2023-09-06 22:48:51.797', '2023-09-06 22:48:51.797', TRUE)