package org.madrona.web.repo;

import org.madrona.web.model.Gender;
import org.madrona.web.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {

    Student findByName(String name);

    Student findByAddressHomeNumber(String addressHomeNumber);

    List<Student> findByGender(Gender gender);
}