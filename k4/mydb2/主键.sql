USE mydb2;

CREATE TABLE student (
sNo VARCHAR(20) PRIMARY KEY,
sName VARCHAR(20),
sex CHAR(2),
classNo VARCHAR(20)
);

INSERT INTO student VALUES('008','tim','男','05');
INSERT INTO student VALUES('008','tim','男','05');

CREATE TABLE student (
sNo VARCHAR(20) ,
sName VARCHAR(20),
sex CHAR(2),
classNo VARCHAR(20),
PRIMARY KEY(sex)
);

INSERT INTO student VALUES('008','tim','男','05');
INSERT INTO student VALUES('008','tim','a','05');

CREATE TABLE student (
sNo VARCHAR(20) ,
sName VARCHAR(20),
sex CHAR(2),
classNo VARCHAR(20),
PRIMARY KEY(sex,sNo)
);


INSERT INTO student VALUES('008','tim','男','05');
INSERT INTO student VALUES('008','tim','a','05');
INSERT INTO student VALUES('009','tim','男','05');
INSERT INTO student VALUES('008','tim','男','05');

DESC student;

DROP TABLE student;

CREATE TABLE student (
sNo VARCHAR(20) ,
sName VARCHAR(20),
sex CHAR(2),
classNo VARCHAR(20)
);

ALTER TABLE student ADD PRIMARY KEY(sNo,sname);

ALTER TABLE student DROP PRIMARY KEY;











