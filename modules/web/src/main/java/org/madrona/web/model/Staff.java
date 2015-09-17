package org.madrona.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "staff")
public class Staff {

    @Field
    private String id;

    @Field
    private String name;

    @Field
    private List<String> teachingSubject;

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

    public List<String> getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(List<String> teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
}
