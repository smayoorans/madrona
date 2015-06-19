package org.madrona.core.dao;

import com.madrona.common.model.Student;

import java.util.List;

public interface StudentDao {

    boolean addStudent(Student student);

    Student getStudentById(int id);

    int deleteStudentById(int id);

    boolean updateStudent(Student student);

    List<Student> getAllStudents();
}

