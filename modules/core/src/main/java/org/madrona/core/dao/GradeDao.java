package org.madrona.core.dao;

import com.madrona.common.model.Grade;

/**
 * @author Mayooran
 */
public interface GradeDao {

    boolean insert(Grade grade);

    Grade get(long id);
}
