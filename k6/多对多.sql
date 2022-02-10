CREATE TABLE IF NOT EXISTS connect (
cn INT ,
sn INT,
score INT,
CONSTRAINT c_fk FOREIGN KEY(cn) REFERENCES course(cno),
CONSTRAINT s_fk FOREIGN KEY(sn) REFERENCES student(sno)
);

CREATE TABLE IF NOT EXISTS course (
cname VARCHAR(20) ,
cno INT PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS student (
sname VARCHAR(20) ,
sno INT PRIMARY KEY
);


INSERT INTO student VALUES('小红',1);
INSERT INTO student VALUES('小明',2);
INSERT INTO student VALUES('小美',3);

INSERT INTO course VALUES('html',1);
INSERT INTO course VALUES('css',2);
INSERT INTO course VALUES('js',3);
INSERT INTO course VALUES('mysql',4);
INSERT INTO course VALUES('jdbc',5);

INSERT INTO connect VALUES(1,1,100);
INSERT INTO connect VALUES(2,1,90);
INSERT INTO connect VALUES(3,1,80);

INSERT INTO connect VALUES(2,2,100);
INSERT INTO connect VALUES(3,2,90);
INSERT INTO connect VALUES(4,2,80);

INSERT INTO connect VALUES(3,3,100);
INSERT INTO connect VALUES(4,3,90);
INSERT INTO connect VALUES(5,3,80);

CREATE TABLE IF NOT EXISTS postgraduate (
teacher VARCHAR(20),
project VARCHAR(20),
pno INT PRIMARY KEY
);

ALTER TABLE postgraduate ADD CONSTRAINT p_fk FOREIGN KEY(pno) REFERENCES student(sno);


INSERT INTO postgraduate VALUES('t1','p1',1);
INSERT INTO postgraduate VALUES('t2','p2',3);









