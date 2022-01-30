USE mydb1;

INSERT INTO student(sNo,sName,sex,classNo)
VALUES('007','eric','男','04'),
			('008','tim','男','05');
			
INSERT INTO student(sName,classNo)
VALUES('app','10');
			
INSERT INTO student VALUES('008','tim','男','05');


UPDATE student SET classNo = '04';

UPDATE student SET classNo = '02' WHERE sNo = '008';

UPDATE student SET classNo = '02',sNo = '001' WHERE sNo = '008';


DELETE FROM student WHERE sNo = '007';

DELETE FROM student;

TRUNCATE TABLE student;

TRUNCATE student;