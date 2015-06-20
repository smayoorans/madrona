package org.madrona.core.dao;

import com.madrona.common.model.Student;

import java.util.List;

public interface StudentDao {

    boolean insert(Student student);

    Student get(long studentId);

    int delete(long id);

    boolean update(Student student);

    List<Student> getAll();
}

