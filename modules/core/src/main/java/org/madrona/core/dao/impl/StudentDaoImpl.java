package org.madrona.core.dao.impl;


import com.madrona.common.model.Student;
import org.madrona.core.dao.StudentDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl extends AbstractDAO<Student> implements StudentDao {

    public StudentDaoImpl() {
        super(Student.class);
    }

    @Override
    public Student getStudentById(int id) {
        return super.getById(id);
    }

    @Override
    public int deleteStudentById(int id) {
        return super.deleteById(id);
    }

    @Override
    public boolean addStudent(Student student) {
        return super.insert(student);
    }

    @Override
    public boolean updateStudent(Student student) {
        return super.update(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return super.getAllRecords();
    }
}
