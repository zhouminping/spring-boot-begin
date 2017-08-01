package com.wap.Service;

import com.wap.Dao.StudentDao;
import com.wap.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by zhouminping on 17-7-31.
 */
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
