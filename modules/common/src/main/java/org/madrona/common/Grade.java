package org.madrona.common;

import javax.persistence.*;

@Entity
@Table(name = "grade")
public class Grade extends PersistentObject {

    @Column(name = "name")
    private String name;

    @Column(name = "teacher")
    private String teacher;

    public Grade() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
