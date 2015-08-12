package org.madrona.core.dao;

import org.madrona.common.Student;

import java.util.List;

/**
 * Student repository interface
 * @author mayooran
 */
public interface StudentDao {

    boolean save(Student student);

    Student get(long studentId);

    List get(String propertyName, Object value);

    int delete(long id);

    boolean update(Student student);

    List<Student> getAll();
}

