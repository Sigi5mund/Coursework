DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS houses;

CREATE TABLE houses(
  id SERIAL4 primary key,
  name VARCHAR(255)
);

CREATE TABLE students(
id SERIAL4 primary key,
first_name VARCHAR(255),
last_name VARCHAR(255),
house_id int4 references houses(id),
age INT2
);
