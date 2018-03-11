DROP TABLE lightsabers;
DROP TABLE jedis;
CREATE TABLE jedis (
  id SERIAL8 PRIMARY KEY,
name VARCHAR(255),
rank INT2,
darkside BOOLEAN
);

CREATE TABLE lightsabers (
    id SERIAL8 PRIMARY KEY,
colour VARCHAR(255) NOT NULL,
hilt_metal VARCHAR(255),
owner_id INT8 REFERENCES jedis(id)
);

INSERT INTO jedis (name, rank, darkside)
VALUES ('Luke', 10, false);

INSERT INTO jedis (name, rank, darkside)
VALUES ('Darth', 100, true);

INSERT INTO jedis (name, rank, darkside)
VALUES ('Anakin', 12, false);

INSERT INTO jedis (name)
Values ('Obiwan');

INSERT INTO lightsabers(colour, hilt_metal, owner_id)
VALUES ('pink', 'gold', 1);

INSERT INTO lightsabers(colour, hilt_metal, owner_id)
VALUES ('blue', 'platinum', 1);

UPDATE jedis
SET darkside = true
WHERE name = 'Luke';

UPDATE jedis
SET darkside = false, rank = 9
WHERE name = 'Obiwan';

UPDATE jedis
SET darkside = true, rank = 22
WHERE name = 'Anakin';

-- DELETE FROM jedis WHERE name = 'Darth';
INSERT INTO jedis (name, rank, darkside)
VALUES ('Darth', 100, true);

DELETE FROM jedis WHERE id =5;
SELECT COUNT(*) FROM jedis;
SELECT * FROM jedis ORDER BY name ASC;

-- SELECT * FROM jedis;

SELECT jedis.name, lightsabers.colour
FROM jedis, lightsabers
WHERE jedis.id = lightsabers.owner_id;
