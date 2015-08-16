package org.madrona.common;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "grade")
public class Grade extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "teacher")
    private String teacher;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "grade")
    private Set<Student> students;

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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
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
