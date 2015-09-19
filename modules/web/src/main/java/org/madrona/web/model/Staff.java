package org.madrona.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "staff")
public class Staff {

    @Field
    private String id;

    @Field
    private String name;

    @Field(value = "gender")
    private Gender gender;

    @Field(value = "date-of-birth")
    private Date dateOfBirth;

    @Field(value = "status")
    private Status status;

    @Field(value = "address")
    private Address address;

    @Field("joined-date")
    private Date joinedDate;


    @Field("mobile-number")
    private String mobileNumber;

    @Field("profile-picture")
    private String profilePicture;

    @Field("email")
    private String email;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(List<String> teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
}
