package org.madrona.core.service.impl;


import org.madrona.common.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.core.dao.StudentDao;
import org.madrona.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = LogManager.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean insert(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public Student getStudent(long studentId) {
        return studentDao.get(studentId);
    }

    @Override
    public Student getStudent(String propertyName, Object value) {
        return null;
    }

    @Override
    public int delete(long id) {
        return studentDao.delete(id);
    }

    @Override
    public boolean update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAll();
    }
}
