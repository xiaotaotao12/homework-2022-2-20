USE mydb3;

SELECT * FROM student LIMIT 2;
SELECT * FROM student LIMIT 2,1;

SELECT * FROM student LIMIT 0,2;
SELECT * FROM student LIMIT 2,2;






CREATE TABLE student2 (
price DOUBLE,
classNo INT
);

INSERT INTO student2(price,classno) SELECT price,classno FROM student;







