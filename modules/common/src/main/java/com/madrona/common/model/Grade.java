package com.madrona.common.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Grade implements Serializable {

    private static final long serialVersionUID = -6790693372846798580L;

    @Id
    @GeneratedValue
    private long id;
    private String gradeName;
    private String gradeTeacher;

    public Grade() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeTeacher() {
        return gradeTeacher;
    }

    public void setGradeTeacher(String gradeTeacher) {
        this.gradeTeacher = gradeTeacher;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gradeName='" + gradeName + '\'' +
                ", gradeTeacher='" + gradeTeacher + '\'' +
                '}';
    }
}
