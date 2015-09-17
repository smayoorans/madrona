package org.madrona.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "grade")
public class Grade {

    @Field
    private String id;

    @Field
    private String name;

    @Field
    private String division;

    @Field
    private Staff currentClassTeacher;

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

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Staff getCurrentClassTeacher() {
        return currentClassTeacher;
    }

    public void setCurrentClassTeacher(Staff currentClassTeacher) {
        this.currentClassTeacher = currentClassTeacher;
    }
}
