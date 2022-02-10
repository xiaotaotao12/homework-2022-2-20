package k6;

import JDBC2.domain.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;

public class course {

    private String cname;
    private int cno;
    private int score;

    public course() {
    }

    public course(String cname, int cno, int score) {
        this.cname = cname;
        this.cno = cno;
        this.score = score;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "course{" +
                "课程名称='" + cname + '\'' +
                ", 课程编号=" + cno +
                ", 课程分数=" + score +
                '}'+'\n';
    }

    public void cdata() throws SQLException {
        ArrayList<course> list = new ArrayList<>();
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT * FROM course,connect WHERE course.cno = connect.cn";
        rs = stat.executeQuery(sql);

        while (rs.next()){
            String cname = rs.getString("cname");
            Integer cno = rs.getInt("cno");
            Integer score = rs.getInt("score");

            course courses = new course(cname,cno,score);
            list.add(courses);
        }
        System.out.println(list);

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

    public void average() throws SQLException {

        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT a.cname,avg(score) average FROM course a,connect b WHERE a.cno = b.cn GROUP BY a.cname";
        rs = stat.executeQuery(sql);

        while (rs.next()){
            String cname = rs.getString("cname");
            Integer average = rs.getInt("average");

            System.out.println(cname+"的平均分是："+average);

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
    public void scoremax() throws SQLException {

        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT a.cname,MAX(score) max FROM course a,connect b WHERE a.cno = b.cn GROUP BY a.cname";
        rs = stat.executeQuery(sql);

        while (rs.next()){
            String cname = rs.getString("cname");
            Integer max = rs.getInt("max");

            System.out.println(cname+"的最高分是："+max);

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
    public void scoremin() throws SQLException {

        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT a.cname,MIN(score) min FROM course a,connect b WHERE a.cno = b.cn GROUP BY a.cname";
        rs = stat.executeQuery(sql);

        while (rs.next()){
            String cname = rs.getString("cname");
            Integer min = rs.getInt("min");

            System.out.println(cname+"的最低分是："+min);

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
}
