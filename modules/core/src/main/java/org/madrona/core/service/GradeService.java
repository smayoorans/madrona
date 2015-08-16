package org.madrona.core.service;

import org.madrona.common.Grade;
import org.madrona.common.Student;

import java.util.List;

/**
 * Grade Related Service
 *
 * @author Mayooran
 */

public interface GradeService {

    boolean save(Grade grade);

    Grade get(long id);

    List<Grade> get(String propertyName, Object value);

    boolean update(Grade grade);

    int delete(long id);

    List<Grade> getAll();

}
