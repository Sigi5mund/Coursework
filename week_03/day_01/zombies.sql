DROP TABLE bites;
DROP TABLE victims;
DROP TABLE zombies;
CREATE TABLE zombies(
id SERIAL8 PRIMARY KEY,
name VARCHAR(255) NOT NULL,
type VARCHAR(255) NOT NULL
);

CREATE TABLE victims (
id SERIAL8 PRIMARY KEY,
name VARCHAR(255) NOT NULL,
run_speed INT2 NOT NULL

);

CREATE TABLE bites (
  id SERIAL8 PRIMARY KEY,
  zombie_id INT8 REFERENCES zombies(id) NOT NULL,
  victim_id INT8 REFERENCES victims(id)NOT NULL,
  incident_time VARCHAR(255) NOT NULL
);


INSERT INTO zombies (name, type)
VALUES ('Charles', 'Royal');

INSERT INTO zombies (name, type)
VALUES ('Camille', 'Kinda_Royal');

INSERT INTO victims (name, run_speed)
VALUES ('Donald', 1);

INSERT INTO victims (name, run_speed)
VALUES ('Teresa', 5);

INSERT INTO bites (zombie_id, victim_id, incident_time)
VALUES ( 1, 1, '2017-11-13');

INSERT INTO bites (zombie_id, victim_id, incident_time)
VALUES ( 2, 1, '2017-11-13');

INSERT INTO bites (zombie_id, victim_id, incident_time)
VALUES ( 2, 2, '2017-11-13');

-- SELECT * FROM zombies;
-- SELECT * FROM victims;
--
--
SELECT victims.name, victims.run_speed
FROM victims, zombies
WHERE  zombies.id = 2;

SELECT * FROM bites;
