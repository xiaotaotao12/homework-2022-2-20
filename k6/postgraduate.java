package k6;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class postgraduate extends student {

    private int pno;
    private String teacher;
    private String project;

    @Override
    public String toString() {
        return "该学生为研究生,导师是："+teacher+",研究项目是："+project+'\n';
    }

    public postgraduate() {
    }

    public postgraduate(int pno, String teacher, String project) {
        this.pno = pno;
        this.teacher = teacher;
        this.project = project;
    }

    public postgraduate(String sname, int sno, HashSet<course> scourse, int pno, String teacher, String project) {
        super(sname, sno, scourse);
        this.pno = pno;
        this.teacher = teacher;
        this.project = project;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public HashSet<postgraduate> pdata() throws SQLException {

        HashSet<postgraduate> h = new HashSet<>();

        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT b.pno,b.project,b.teacher FROM student a,postgraduate b WHERE a.sno = b.pno";
        rs = stat.executeQuery(sql);

        while (rs.next()) {
            Integer pno = rs.getInt("pno");
            String project = rs.getString("project");
            String teacher = rs.getString("teacher");

            postgraduate p = new postgraduate(pno, project, teacher);
            h.add(p);
        }


        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return h;
    }

    @Override
    public void sdata() throws SQLException {

        Set<postgraduate> p = pdata();

        student students = new student();
        HashSet<course> h = new HashSet<>();
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb5?useUnicode=true&characterEncoding=gbk&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Hongkong", "root", "123456");
        stat = con.createStatement();

        String sql = "SELECT c.sname,c.sno,a.cname,a.cno,b.score FROM course a,connect b,student c WHERE a.cno = b.cn AND c.sno = b.sn";
        rs = stat.executeQuery(sql);

        while (rs.next()) {
            String sname = rs.getString("sname");
            Integer sno = rs.getInt("sno");
            String cname = rs.getString("cname");
            Integer cno = rs.getInt("cno");
            Integer score = rs.getInt("score");

            if (sno != students.getSno() && students.getSname() != null) {

                System.out.println(students);
                for (postgraduate p1 : p) {
                    if(p1.getPno()==students.getSno()) {
                        System.out.println(p1);
                    }
                }

                h.clear();
                students.setSname(sname);

                students.setSno(sno);
                course c = new course(cname, cno, score);
                h.add(c);
                students.setScourse(h);
            } else if (sno != students.getSno()) {
                h.clear();
                students.setSname(sname);
                students.setSno(sno);
                course c = new course(cname, cno, score);
                h.add(c);
                students.setScourse(h);
            } else {
                course c = new course(cname, cno, score);
                h.add(c);
                students.setScourse(h);
            }

        }
        System.out.println(students);
        for (postgraduate p1 : p) {
            if(p1.getPno()==students.getSno()){
                System.out.println(p1);
            }
        }

        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
