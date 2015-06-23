package org.madrona.core.service;


import org.madrona.common.Student;

import java.util.List;

/**
 * @author Mayooran
 */

public interface StudentService {

    boolean insert(Student student);

    Student getStudent(long studentId);

    Student getStudent(String propertyName, Object value);

    boolean update(Student student);

    int delete(long id);

    List<Student> getAllStudents();
}
