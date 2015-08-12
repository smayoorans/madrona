package org.madrona.core.service.impl;

import org.madrona.common.Grade;
import org.madrona.core.dao.GradeDao;
import org.madrona.core.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return null;
    }
}
