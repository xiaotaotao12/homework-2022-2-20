USE mydb2;


CREATE TABLE student (
sNo VARCHAR(20) UNIQUE,
sName VARCHAR(20),
sex CHAR(2),
classNo VARCHAR(20)
);


ALTER TABLE student ADD CONSTRAINT s1 UNIQUE(sname);

ALTER TABLE student DROP INDEX sno;
ALTER TABLE student DROP INDEX s1;

CREATE TABLE student (
sNo VARCHAR(20) DEFAULT(1),
sName VARCHAR(20),
sex CHAR(2),
classNo VARCHAR(20)
);

INSERT INTO student(sName,sex,classNo)
VALUES('eric','男','04'),
			('tim','男','05');

ALTER TABLE student MODIFY sno VARCHAR(20) DEFAULT(2);

ALTER TABLE student MODIFY sno VARCHAR(20) DEFAULT(NULL);

ALTER TABLE student MODIFY sno VARCHAR(20) DEFAULT NULL;


