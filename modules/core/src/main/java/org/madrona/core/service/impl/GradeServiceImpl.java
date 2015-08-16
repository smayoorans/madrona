package org.madrona.core.service.impl;

import org.madrona.common.Grade;
import org.madrona.core.dao.GradeDao;
import org.madrona.core.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeDao gradeDao;

    @Override
    @Transactional
    public boolean save(Grade grade) {
        return gradeDao.save(grade);
    }

    @Override
    @Transactional
    public Grade get(long id) {
        return gradeDao.get(id);
    }

    @Override
    @Transactional
    public List<Grade> get(String propertyName, Object value) {
        return gradeDao.get(propertyName,value);
    }

    @Override
    @Transactional
    public boolean update(Grade grade) {
        return gradeDao.update(grade);
    }

    @Override
    @Transactional
    public int delete(long id) {
        return gradeDao.delete(id);
    }

    @Override
    @Transactional
    public List<Grade> getAll() {
        return gradeDao.getAll();
    }
}
