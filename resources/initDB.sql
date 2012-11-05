CREATE DATABASE IF NOT EXISTS BANKENSIMAG;
USE BANKENSIMAG;

DROP TABLE IF EXISTS CLIENT;
DROP TABLE IF EXISTS ACCOUNT;

CREATE TABLE CLIENT (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	firstName VARCHAR(15),
	lastName VARCHAR(20),
	address VARCHAR(50),
	email VARCHAR(40),
	age INTEGER
); 

CREATE TABLE ACCOUNT (
	id VARCHAR(30),
	typeCard VARCHAR(20),
	cardHolder VARCHAR(30),
	expire DATETIME
);

INSERT INTO CLIENT(firstName, lastName, address, email, age) VALUES("Nguyen","Kim Thuat","5 bis, rue Ernest Calvat, 38000 Grenoble, France","nguyenki@ensimag.imag.fr","23");
INSERT INTO CLIENT(firstName, lastName, address, email, age) VALUES("Perter","Alex","23, rue Bizanet, 38400 Grenoble, France","alexC@ensimag.imag.fr","23");
INSERT INTO CLIENT(firstName, lastName, address, email, age) VALUES("Paul","Alex","6 rue Victor Hugo,38000 Grenoble, France","alexPas@ensimag.imag.fr","23");
INSERT INTO CLIENT(firstName, lastName, address, email, age) VALUES("Ronaldo","Oliver","5 bis, rue Saint Etienen, 38000 Grenoble, France","oliver@ensimag.imag.fr","23");

