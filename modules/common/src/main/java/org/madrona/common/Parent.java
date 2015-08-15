package org.madrona.common;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "parent")
public class Parent extends BaseEntity {

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "father_job")
    private String fatherJob;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "mother_job")
    private String motherJob;

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherJob() {
        return fatherJob;
    }

    public void setFatherJob(String fatherJob) {
        this.fatherJob = fatherJob;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherJob() {
        return motherJob;
    }

    public void setMotherJob(String motherJob) {
        this.motherJob = motherJob;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", fatherName='" + fatherName + '\'' +
                ", fatherJob='" + fatherJob + '\'' +
                ", motherName='" + motherName + '\'' +
                ", motherJob='" + motherJob + '\'' +
                '}';
    }
}
