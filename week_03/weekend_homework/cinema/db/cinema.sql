DROP TABLE IF EXISTS tickets;
DROP TABLE IF EXISTS screenings;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS films;

CREATE TABLE customers (
id SERIAL4 PRIMARY KEY,
name VARCHAR(255),
funds NUMERIC
);

CREATE TABLE films (
id SERIAL4 PRIMARY KEY,
title VARCHAR(255),
price NUMERIC
);


CREATE TABLE screenings (
id SERIAL4 PRIMARY KEY,
film_id INT4 REFERENCES films(id),
start_time TIMESTAMP,
empty_seats INT2
);

CREATE TABLE tickets (
  id SERIAL4 PRIMARY KEY,
  customer_id INT4 REFERENCES customers(id),
  screening_id INT4 REFERENCES screenings(id)
);
