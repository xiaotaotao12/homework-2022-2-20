package JDBC2.service;

import JDBC2.dao.StudentDao;
import JDBC2.dao.StudentDaolmpl;
import JDBC2.domain.Student;

import java.util.ArrayList;

public class StudentServicelmpl implements StudentService{

    private StudentDao dao = new StudentDaolmpl();

    @Override
    public ArrayList<Student> findAll() {
        return dao.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public int insert(Student stu) {
        return dao.insert(stu);
    }

    @Override
    public int update(Student stu) {
        return dao.update(stu);
    }

    @Override
    public int delete(Integer id) {
        return dao.delete(id);
    }
}
