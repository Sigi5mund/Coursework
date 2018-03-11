# SQL Homework

The Dominion Cinema are having a Marvel Movie Marathon! They have asked you to help maintain their database of movies with times and attendees.

## To access the database:

First, create a database called 'marvel'

```
# terminal
createdb marvel
```

Next, run the provided SQL script to populate your database:

```
# terminal
psql -d marvel -f marvel.sql
```

Use the supplied data as the source of data to answer the questions.  Copy the SQL command you have used to get the answer, and paste it below the question, along with the result they gave.

## Questions

1. Return ALL the data in the 'movies' table.

SELECT * FROM movies;

2. Return ONLY the name column from the 'people' table

SELECT name FROM people;

3. Oops! Someone at CodeClan spelled Ian's name wrong! Change it to reflect the proper spelling (change 'Iain Henderson' to 'Ian Henderson').

UPDATE people SET name = 'Ian Henderson' WHERE name = 'Iain Henderson';

4. Return ONLY your name from the 'people' table.

SELECT name FROM people WHERE name = 'Andrew  Wright'

5. The cinema is showing 'Batman Begins', but Batman is DC, not Marvel! Delete the entry from the 'movies' table.

DELETE FROM movies WHERE title = 'Batman Begins';

6. Create a new entry in the 'people' table with the name of one of the instructors.

INSERT INTO people (name) VALUES ('Keith Douglas');

<!-- 7. Craig Morton, has decided to hijack our movie evening, Remove him from the table of people. -->

8. Somehow the list of people includes two people named 'Andrew'. Change these entries to the proper names ('Jeff 4', 'Jeff 5')

UPDATE people SET name ='Jeff4' WHERE id = 21;
UPDATE people SET name ='Jeff5' WHERE id = 22;

9. The cinema has just heard that they will be holding an exclusive midnight showing of 'Guardians of the Galaxy 2'!! Create a new entry in the 'movies' table to reflect this.

INSERT INTO movies (title, year, show_time) VALUES ('Guardians of the Galaxy 2', 2017, '00.00');

10. The cinema would also like to make the Guardian movies a back to back feature. Update the 'Guardians of the Galaxy' show time from 18:55 to 21:30

UPDATE movies SET show_time = '21.30' WHERE show_time = '13:15' AND title = 'Guardians of the Galaxy';


## Research

1. Research how to delete multiple entries from your table in a single command.

delete from movies where id in (21,22,33);
delete from movies where id between (21,33)
delete from movies where title in ('Ant-Man', 'Iron Man 3');
delete from movies where year <2014 or year >2017;

select * from movies
where title like '%the%'
