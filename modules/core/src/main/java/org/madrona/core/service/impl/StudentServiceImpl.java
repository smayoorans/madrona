package org.madrona.core.service.impl;


import org.madrona.common.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.core.dao.StudentDao;
import org.madrona.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>Student Service Implementation</p>
 */
@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger LOGGER = LogManager.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public boolean save(Student student) {
        return studentDao.save(student);
    }

    @Override
    @Transactional
    public Student get(long studentId) {
        return studentDao.get(studentId);
    }

    @Override
    @Transactional
    public Student get(String propertyName, Object value) {
        return null;
    }

    @Override
    @Transactional
    public int delete(long id) {
        return studentDao.delete(id);
    }

    @Override
    @Transactional
    public boolean update(Student student) {
        return studentDao.update(student);
    }

    @Override
    @Transactional
    public List<Student> getAll() {
        return studentDao.getAll();
    }
}
