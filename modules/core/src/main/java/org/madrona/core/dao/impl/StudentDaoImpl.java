package org.madrona.core.dao.impl;


import com.madrona.common.model.Student;
import org.hibernate.SessionFactory;
import org.madrona.core.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    protected SessionFactory sessionFactory;


    @Override
    @Transactional
    public boolean addStudent(Student student) {

        sessionFactory.getCurrentSession().save(student);
        return true;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public int deleteStudentById(int id) {
        return 0;
    }

    @Override
    public boolean updateStudent(Student student) {
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
