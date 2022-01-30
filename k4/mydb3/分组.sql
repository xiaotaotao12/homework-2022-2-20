USE mydb3;

SELECT classno , COUNT(*) FROM student GROUP BY classno ;
SELECT price , COUNT(*) FROM student GROUP BY price ;

SELECT classno FROM student GROUP BY classno ;
SELECT price FROM student GROUP BY price;

SELECT classno , COUNT(*) FROM student GROUP BY classno, price ;
SELECT price , COUNT(*) FROM student GROUP BY price, classno;




SELECT classno , COUNT(*) FROM student GROUP BY classno HAVING COUNT(*) < 2;
SELECT price , COUNT(*) FROM student GROUP BY price HAVING COUNT(*) > 1;

SELECT classno , COUNT(*) FROM student GROUP BY classno HAVING COUNT(*) < 3 ORDER BY classno;
SELECT classno , COUNT(*) FROM student GROUP BY classno HAVING COUNT(*) < 3 ORDER BY classno DESC;




























