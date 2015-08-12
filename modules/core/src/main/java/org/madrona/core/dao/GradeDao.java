package org.madrona.core.dao;

import org.madrona.common.Grade;

/**
 * @author Mayooran
 */
public interface GradeDao {

    boolean save(Grade grade);

    Grade get(long id);
}
