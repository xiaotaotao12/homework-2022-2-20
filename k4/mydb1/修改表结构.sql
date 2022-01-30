USE mydb1;

ALTER TABLE student ADD teacher VARCHAR(20);

ALTER TABLE student CHANGE teacher students VARCHAR(20);

ALTER TABLE student DROP students;

RENAME TABLE student TO students;

RENAME TABLE students TO student;
