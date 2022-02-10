package k6;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;

public class student {

    private String sname;
    private int sno;
    private HashSet<course> scourse;

    @Override
    public String toString() {
        return "student{" +'\n'+
                "学生姓名'" + sname + '\'' +'\n'+
                "学生编号=" + sno +'\n'+
                "学生选择课程" +'\n'+ scourse +
                '}';
    }

    public student() {
    }

    public student(String sname, int sno, HashSet<course> scourse) {
        this.sname = sname;
        this.sno = sno;
        this.scourse = scourse;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public HashSet<course> getScourse() {
        return scourse;
    }

    public void setScourse(HashSet<course> scourse) {
        this.scourse = scourse;
    }

    public void sdata() throws SQLException {
        student students = new student();
        HashSet<course> h = new HashSet<>();
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT c.sname,c.sno,a.cname,a.cno,b.score FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn";
        rs = stat.executeQuery(sql);

        while (rs.next()){
            String sname = rs.getString("sname");
            Integer sno = rs.getInt("sno");
            String cname = rs.getString("cname");
            Integer cno = rs.getInt("cno");
            Integer score = rs.getInt("score");

            if (sno!=students.getSno()&&students.getSname()!=null) {
                System.out.println(students);
                h.clear();
                students.setSname(sname);

                students.setSno(sno);
                course c = new course(cname,cno,score);
                h.add(c);
                students.setScourse(h);
            }else if (sno!=students.getSno()){
                h.clear();
                students.setSname(sname);
                students.setSno(sno);
                course c = new course(cname,cno,score);
                h.add(c);
                students.setScourse(h);
            }else{
                course c = new course(cname,cno,score);
                h.add(c);
                students.setScourse(h);
            }

        }
        System.out.println(students);

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
    public void score() throws SQLException {
        int x1=0,x2=0;
        student students = new student();
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT c.sname,c.sno,a.cname,a.cno,b.score FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn";
        rs = stat.executeQuery(sql);

        while (rs.next()){
            String sname = rs.getString("sname");
            Integer sno = rs.getInt("sno");
            Integer score = rs.getInt("score");

            if (sno!=students.getSno()&&students.getSname()!=null) {
                double x3=x2/(x1+x2);
                if (x2>0.4){
                    System.out.println(students.getSname()+":不及格科目多于40%");
                }else{
                    System.out.println(students.getSname()+":成绩良好");
                }
                x1=0;
                x2=0;
                x3=0;
                students.setSname(sname);
                students.setSno(sno);
                if(score>59){
                    x1++;
                }else {
                    x2++;
                }
            }else if (sno!=students.getSno()){
                students.setSname(sname);
                students.setSno(sno);
                if(score>59){
                    x1++;
                }else {
                    x2++;
                }
            }else{
                if(score>59){
                    x1++;
                }else {
                    x2++;
                }
            }

        }
        double x3=x2/(x1+x2);
        if (x2>0.4){
            System.out.println(students.getSname()+":不及格科目多于40%");
        }else{
            System.out.println(students.getSname()+":成绩良好");
        }

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
    public void sdata(String snamescore) throws SQLException {
        student students = new student();
        HashSet<course> h = new HashSet<>();
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT c.sname,c.sno,a.cname,a.cno,b.score FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn AND c.sname='"+snamescore+"'";
        rs = stat.executeQuery(sql);

        while (rs.next()){
            String sname = rs.getString("sname");
            Integer sno = rs.getInt("sno");
            String cname = rs.getString("cname");
            Integer cno = rs.getInt("cno");
            Integer score = rs.getInt("score");

            students.setSname(sname);
            students.setSno(sno);
            course c = new course(cname,cno,score);
            h.add(c);
        }
        students.setScourse(h);
        System.out.println(students);

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
    public void sdata(int snoscore) throws SQLException {
        student students = new student();
        HashSet<course> h = new HashSet<>();
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT c.sname,c.sno,a.cname,a.cno,b.score FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn AND c.sno='"+snoscore+"'";
        rs = stat.executeQuery(sql);

        while (rs.next()){
            String sname = rs.getString("sname");
            Integer sno = rs.getInt("sno");
            String cname = rs.getString("cname");
            Integer cno = rs.getInt("cno");
            Integer score = rs.getInt("score");

            students.setSname(sname);
            students.setSno(sno);
            course c = new course(cname,cno,score);
            h.add(c);
        }
        students.setScourse(h);
        System.out.println(students);

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
}
