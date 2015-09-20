package org.madrona.web.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "parent")
public class Parent {

    @Field(value = "father-name")
    private String fatherName;

    @Field(value = "mother-name")
    private String motherName;

    @Field(value = "father-job")
    private String fatherJob;

    @Field(value = "mother-job")
    private String motherJob;

    @Field(value = "father-date-birth")
    private Date fatherDateOfBirth;

    @Field("mother-date-birth")
    private Date motherDateOfBirth;

    @Field("contact-number")
    private String contactNumber;


    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherJob() {
        return fatherJob;
    }

    public void setFatherJob(String fatherJob) {
        this.fatherJob = fatherJob;
    }

    public String getMotherJob() {
        return motherJob;
    }

    public void setMotherJob(String motherJob) {
        this.motherJob = motherJob;
    }

    public Date getFatherDateOfBirth() {
        return fatherDateOfBirth;
    }

    public void setFatherDateOfBirth(Date fatherDateOfBirth) {
        this.fatherDateOfBirth = fatherDateOfBirth;
    }

    public Date getMotherDateOfBirth() {
        return motherDateOfBirth;
    }

    public void setMotherDateOfBirth(Date motherDateOfBirth) {
        this.motherDateOfBirth = motherDateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}