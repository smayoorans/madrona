package org.madrona.core.service;

import com.madrona.common.model.Grade;

/**
 * Grade Service
 *
 * @author Mayooran
 */

public interface GradeService {

    boolean insert(Grade grade);

    Grade get(long id);
}
