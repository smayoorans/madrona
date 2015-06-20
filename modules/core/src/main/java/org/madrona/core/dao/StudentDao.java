package org.madrona.core.dao;

import org.madrona.common.Student;

import java.util.List;

public interface StudentDao {

    boolean insert(Student student);

    Student get(long studentId);

    int delete(long id);

    boolean update(Student student);

    List<Student> getAll();
}

