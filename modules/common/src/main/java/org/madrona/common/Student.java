package org.madrona.common;

import org.madrona.common.enumz.Gender;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue
    @Column(unique = true, nullable = false)
    private long id;

    private String studentName;

    private LocalDate dateOfBirth;

    private String grade;

    private Gender gender;

    private String emailAddress;

    private String mobileNumber;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Address homeAddress;

    private LocalDate joinedDate;

    public Student() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String firstName) {
        this.studentName = firstName;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
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

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + studentName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", grade='" + grade + '\'' +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", homeAddress=" + homeAddress +
                ", joinedDate=" + joinedDate +
                '}';
    }
}
