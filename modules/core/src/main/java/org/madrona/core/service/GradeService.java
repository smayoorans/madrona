package org.madrona.core.service;

import org.madrona.common.Grade;

/**
 * Grade Related Service
 *
 * @author Mayooran
 */

public interface GradeService {

    boolean insert(Grade grade);

    Grade get(long id);
}
