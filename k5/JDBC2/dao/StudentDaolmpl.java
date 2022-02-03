package JDBC2.dao;

import JDBC2.domain.Student;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StudentDaolmpl implements StudentDao{

    @Override
    public ArrayList<Student> findAll() {

        ArrayList<Student> list = new ArrayList<>();
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb4?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
            stat = con.createStatement();

            String sql = "select * from student";
            rs = stat.executeQuery(sql);

            while (rs.next()){
                Integer sid = rs.getInt("sid");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");

                Student stu = new Student(sid,name,age,birthday);

                list.add(stu);


            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(stat != null){
                try {
                    stat.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(rs != null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return list;

    }

    @Override
    public Student findById(Integer id) {
        Student stu = new Student();
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb4?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
            stat = con.createStatement();

            String sql = "select * from student where sid = '"+id+"'";
            rs = stat.executeQuery(sql);

            while (rs.next()) {

                Integer sid = rs.getInt("sid");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");

                stu.setSid(sid);
                stu.setName(name);
                stu.setAge(age);
                stu.setBirthday(birthday);

            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(stat != null){
                try {
                    stat.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(rs != null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return stu;

    }

    @Override
    public int insert(Student stu) {


        Connection con = null;
        Statement stat = null;
        int result = 0;
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb4?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
            stat = con.createStatement();


            Date d = stu.getBirthday();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String birthday = sdf.format(d);

            String sql = "insert into student values ('"+stu.getSid()+"','"+stu.getName()+"','"+stu.getAge()+"','"+birthday+"')";
            result = stat.executeUpdate(sql);


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(stat != null){
                try {
                    stat.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }

        return result;
    }

    @Override
    public int update(Student stu) {
        Connection con = null;
        Statement stat = null;
        int result = 0;
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb4?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
            stat = con.createStatement();


            Date d = stu.getBirthday();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String birthday = sdf.format(d);

            String sql = "update student set sid = '"+stu.getSid()+"','"+stu.getName()+"','"+stu.getAge()+"','"+birthday+"' where sid = '"+stu.getSid()+"'";
            result = stat.executeUpdate(sql);


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(stat != null){
                try {
                    stat.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }

        return result;
    }

    @Override
    public int delete(Integer id) {

            Connection con = null;
            Statement stat = null;
            int result = 0;
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb4?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
                stat = con.createStatement();

                String sql = "delete from student where sid = '" + id +"'";
                result = stat.executeUpdate(sql);


            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(con != null){
                    try {
                        con.close();
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                }

                if(stat != null){
                    try {
                        stat.close();
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                }

            }

            return result;
    }
}
