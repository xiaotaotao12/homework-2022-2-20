USE mydb3;

SELECT 6 + 2;
SELECT 6 - 2;
SELECT 6 * 2;
SELECT 6 / 2;
SELECT 6 % 2;

SELECT sname, price * 1.1 new_price FROM student;

SELECT * FROM student WHERE sname = '海尔洗衣机';

SELECT * FROM student WHERE price = 3000;
SELECT * FROM student WHERE price != 3000;
SELECT * FROM student WHERE price <> 3000;
SELECT * FROM student WHERE NOT (price=3000);
SELECT * FROM student WHERE price > 2500;
SELECT * FROM student WHERE price >= 5000;
SELECT * FROM student WHERE price >= 1000 and price <= 5000;
SELECT * FROM student WHERE price >= 1000 && price <= 5000;
SELECT * FROM student WHERE price BETWEEN 1000 AND 5000;
SELECT * FROM student WHERE price in(10,3000,5200);
SELECT * FROM student WHERE price = 100 OR price = 3000 OR price = 5200;
SELECT * FROM student WHERE price = 100 || price = 3000 || price = 5200;


SELECT * FROM student WHERE sname LIKE '海尔洗衣机';
SELECT * FROM student WHERE sname LIKE '%衣%';
SELECT * FROM student WHERE sname LIKE '%机%';
SELECT * FROM student WHERE sname LIKE '%机%';
SELECT * FROM student WHERE sname LIKE '%机%';
SELECT * FROM student WHERE sname LIKE '____机%';
SELECT * FROM student WHERE sname LIKE '_的%';

SELECT * FROM student WHERE classno IS NULL;
SELECT * FROM student WHERE classno IS NOT NULL;

SELECT least(10,20);
SELECT least(10,NULL,20);
SELECT greatest(10,20,30);
SELECT greatest(10,20,NULL,30);






