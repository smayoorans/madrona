package org.madrona.common;

import javax.persistence.*;


@Entity
@Table(name = "grade")
public class Grade extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "grade")
    private String gradeTeacher;

    public Grade() {
    }

    public String getName() {
        return name;
    }

    public void setName(String gradeName) {
        this.name = gradeName;
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
                ", name='" + name + '\'' +
                ", gradeTeacher='" + gradeTeacher + '\'' +
                '}';
    }
}
