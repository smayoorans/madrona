package org.madrona.core.service;



import com.madrona.common.model.Student;

import java.util.List;

public interface StudentService {

    Student getStudentById(int id);

    int deleteStudentById(int id);

    boolean addStudent(Student student);

    boolean updateStudent(Student student);

    List<Student> getAllStudents();
}
