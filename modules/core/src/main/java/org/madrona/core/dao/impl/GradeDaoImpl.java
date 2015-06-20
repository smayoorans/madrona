package org.madrona.core.dao.impl;

import org.madrona.common.Grade;
import org.madrona.core.dao.GradeDao;
import org.springframework.stereotype.Repository;

@Repository
public class GradeDaoImpl extends AbstractDAO<Grade> implements GradeDao {

    public GradeDaoImpl() {
        super(Grade.class);
    }

    @Override
    public boolean insert(Grade grade) {
        return super.insert(grade);
    }

    @Override
    public Grade get(long id) {
        return super.getById(id);
    }
}
