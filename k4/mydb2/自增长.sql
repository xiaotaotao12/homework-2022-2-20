USE mydb2;

CREATE TABLE student (
sNo INT PRIMARY KEY auto_increment,
sName VARCHAR(20),
sex CHAR(2),
classNo VARCHAR(20)
);

INSERT INTO student(sName,sex,classNo)
VALUES('eric','男','04'),
			('tim','男','05');

INSERT INTO student VALUES(3,'tim','男','05');
INSERT INTO student VALUES(10,'tim','男','05');

INSERT INTO student(sName,sex,classNo)
VALUES('eric','男','04');

INSERT INTO student VALUES(7,'tim','男','05');

CREATE TABLE student (
sNo INT PRIMARY KEY auto_increment,
sName VARCHAR(20),
sex CHAR(2),
classNo VARCHAR(20)
)auto_increment=100;

ALTER TABLE student auto_increment=120;
ALTER TABLE student auto_increment=150;

DESC student;

DROP TABLE student;