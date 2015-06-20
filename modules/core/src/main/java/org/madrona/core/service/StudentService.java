package org.madrona.core.service;



import org.madrona.common.Student;

import java.util.List;

/**
 *  Student Service Interface
 *  @author Mayooran
 */
public interface StudentService {

    boolean insert(Student student);

    Student getStudent(long studentId);

    boolean update(Student student);

    int delete(long id);

    List<Student> getAllStudents();
}
