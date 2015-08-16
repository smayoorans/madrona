package org.madrona.core.dao;

import org.madrona.common.Grade;

import java.util.List;

/**
 * @author Mayooran
 */
public interface GradeDao {

    boolean save(Grade grade);

    Grade get(long id);

    List<Grade> get(String propertyName, Object value);

    int delete(long id);

    boolean update(Grade grade);

    List<Grade> getAll();
}
