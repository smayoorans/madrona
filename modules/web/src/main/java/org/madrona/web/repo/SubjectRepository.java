package org.madrona.web.repo;

import org.madrona.web.model.Gender;
import org.madrona.web.model.Student;
import org.madrona.web.model.Subjects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends CrudRepository<Subjects, String> {

    Student findByName(String name);

}