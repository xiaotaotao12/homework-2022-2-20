USE mydb3;

SELECT * FROM student ORDER BY price ;
SELECT * FROM student ORDER BY price ASC;
SELECT * FROM student ORDER BY price DESC;

SELECT * FROM student ORDER BY price ASC, classno ASC;
SELECT * FROM student ORDER BY price DESC, classno ASC;

SELECT DISTINCT price FROM student ORDER BY price ASC;



SELECT count(*) FROM student;
SELECT COUNT(sno) FROM student;

SELECT COUNT(sno) FROM student WHERE sno > 3;

SELECT * FROM student WHERE classno = 3;
SELECT SUM(price) FROM student WHERE classno = 3; 
SELECT SUM(price) FROM student ;

SELECT MAX(price) FROM student;
SELECT MIN(price) FROM student;
SELECT MAX(price) max , MIN(price) min FROM student;

SELECT avg(price) FROM student; 
SELECT avg(price) FROM student WHERE classno >= 2; 

-- count sum avg max min 无视 null;



