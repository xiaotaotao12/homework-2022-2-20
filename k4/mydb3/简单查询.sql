USE mydb3;

SELECT * FROM student ;
SELECT sname,price FROM student; 

SELECT * FROM student as s;
SELECT * FROM student s;

SELECT p.id,u.id FROM student1 p,student2 u;

SELECT sno as s1, sname s2 FROM student;

SELECT DISTINCT price FROM student;
SELECT DISTINCT * FROM student;

SELECT sname, price +10 new_price FROM student;






