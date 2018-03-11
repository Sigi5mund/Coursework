DROP TABLE pizzas;
DROP TABLE toppings;

CREATE TABLE toppings (
  id serial4 primary key,
  topping_type varchar(255)
);

CREATE TABLE pizzas (
  id serial4 primary key,
  first_name varchar(255),
  last_name varchar(255),
  topping_id int4 REFERENCES toppings(id),
  quantity int2
);

