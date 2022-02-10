package k6;

import java.sql.SQLException;

public class controller {

    public static void main(String[] args) throws SQLException {

        course test1 = new course();
        //test1.cdata();//课程信息
        //test1.average();//课程平均分
        //test1.scoremax();//最高分
        //test1.scoremin();//最低分

        student test2 = new student();
        //test2.sdata();//学生信息
        //test2.score();//学生分数及格率检查
        //test2.sdata("小明");//名字查询
        //test2.sdata(3);//学号查询

        student test3 = new postgraduate();
        //test3.sdata();//重写了搜索学生信息的方法

    }

}
