package org.madrona.core.service.impl;

import com.madrona.common.model.Grade;
import org.madrona.core.dao.GradeDao;
import org.madrona.core.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeDao gradeDao;

    @Override
    public boolean insert(Grade grade) {
        return gradeDao.insert(grade);
    }

    @Override
    public Grade get(long id) {
        return null;
    }
}
