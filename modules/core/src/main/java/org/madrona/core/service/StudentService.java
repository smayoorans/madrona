package org.madrona.core.service;


import org.madrona.common.Student;

import java.util.List;

/**
 * <p>Student Services Interface</p>
 * @author Mayooran
 */

public interface StudentService {

    boolean save(Student student);

    Student get(long studentId);

    Student get(String propertyName, Object value);

    boolean update(Student student);

    int delete(long id);

    List<Student> getAll();
}
