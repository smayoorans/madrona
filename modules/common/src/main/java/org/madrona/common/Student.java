package org.madrona.common;

import org.madrona.common.enumz.Gender;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student extends BaseEntity {

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "grade")
    private String grade;

    @Column(name = "gender")
    private Gender gender;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Address homeAddress;

    @Column(name = "joined_date")
    private Date joinedDate;

    @Column(name = "profile_picture")
    private String profilePicture;

    public Student() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String firstName) {
        this.studentName = firstName;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", grade='" + grade + '\'' +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", homeAddress=" + homeAddress +
                ", joinedDate=" + joinedDate +
                ", profilePicture='" + profilePicture + '\'' +
                '}';
    }
}
