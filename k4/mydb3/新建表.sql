USE mydb3;

CREATE TABLE student (
sNo INT PRIMARY KEY auto_increment,
sName VARCHAR(10) NOT NULL,
price DOUBLE,
classNo INT
);

INSERT INTO student VALUES(NULL,'海尔洗衣机',5000,001);
INSERT INTO student VALUES(NULL,'美的空调',3000,002);
INSERT INTO student VALUES(NULL,'格力空调',3000,003);
INSERT INTO student VALUES(NULL,'九阳电饭煲',1000,003);



