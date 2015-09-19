package org.madrona.web.repo;

import org.madrona.web.model.Gender;
import org.madrona.web.model.Parent;
import org.madrona.web.model.Staff;
import org.madrona.web.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParentRepository extends CrudRepository<Parent, String> {

}