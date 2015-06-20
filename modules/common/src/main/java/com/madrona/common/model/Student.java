package com.madrona.common.model;

import com.madrona.common.model.enumz.Gender;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {

    private static final long serialVersionUID = -6790693372846798580L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "STUDENT_ID", unique = true, nullable = false)
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    @Column(name = "GRADE")
    private String grade;

    @Column(name = "GENDER")
    private Gender gender;

    @Column(name = "EMAIL")
    private String emailAddress;

    @Column(name = "MOBILE_NO")
    private String mobileNumber;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Address homeAddress;

    @Column(name = "JOINED_DATE")
    private LocalDate joinedDate;

    public Student() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
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
