

SELECT * FROM course,connect;
SELECT * FROM course,connect WHERE course.cno = connect.cn;
SELECT * FROM course JOIN connect ON course.cno = connect.cn;
SELECT * FROM course a,connect b WHERE a.cno = b.cn;


SELECT * FROM course a,connect b WHERE a.cno = b.cn AND a.cname='css';
SELECT * FROM course a,connect b WHERE a.cno = b.cn AND (a.cname='css' OR a.cname='js');

SELECT * FROM course a,connect b WHERE a.cno = b.cn;
SELECT a.cname,avg(score) average FROM course a,connect b WHERE a.cno = b.cn GROUP BY a.cname;

SELECT * FROM course a,connect b WHERE a.cno = b.cn;
SELECT a.cname,MIN(score) min FROM course a,connect b WHERE a.cno = b.cn GROUP BY a.cname;
SELECT a.cname,MAX(score) max FROM course a,connect b WHERE a.cno = b.cn GROUP BY a.cname;

SELECT * FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn;
SELECT * FROM student;
SELECT * FROM student a,connect b WHERE a.sno = b.sn;
SELECT * FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn;

SELECT * FROM student;



SELECT c.sname,c.sno,a.cname,a.cno,b.score FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn;

SELECT a.sname,a.sno,b.score FROM student a,connect b WHERE a.sno = b.sn;

SELECT c.sname,c.sno,a.cname,a.cno,b.score FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn AND c.sname='小美';


SELECT c.sname,c.sno,a.cname,a.cno,b.score FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn;
SELECT b.pno,b.project,b.teacher FROM student a,postgraduate b WHERE a.sno = b.pno;





































