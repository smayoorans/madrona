package org.madrona.core.dao.impl;

import org.madrona.common.Grade;
import org.madrona.core.dao.GradeDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GradeDaoImpl extends AbstractDAO<Grade> implements GradeDao {

    public GradeDaoImpl() {
        super(Grade.class);
    }

    @Override
    public boolean save(Grade grade) {
        return super.save(grade);
    }

    @Override
    public Grade get(long id) {
        return super.getById(id);
    }

    @Override
    public List<Grade> get(String propertyName, Object value) {
        return (List<Grade>)super.get(propertyName, value);
    }

    @Override
    public int delete(long id) {
        return super.deleteById(id);
    }


    @Override
    public boolean update(Grade grade) {
        return super.update(grade);
    }

    @Override
    public List<Grade> getAll() {
        return super.getAll();
    }
}
