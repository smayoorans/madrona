package org.madrona.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subjects")
public class Subjects {

    @Id
    private String id;

    private String name;

    private Grade grade;

    private String teachingStaff;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getTeachingStaff() {
        return teachingStaff;
    }

    public void setTeachingStaff(String teachingStaff) {
        this.teachingStaff = teachingStaff;
    }
}
