package org.madrona.common;

import org.madrona.common.enumz.Gender;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Staff implements Serializable {

    @Id
    @GeneratedValue
    private int staffId;

    private final String firstName;

    private final String lastName;

    private final Gender gender;

    private final LocalDate dateOfBirth;

    private final String emailAddress;

    private final String mobile;

    private final String completedDegree;

    private final String staffStatus;


    public Staff(StaffBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
        this.emailAddress = builder.emailAddress;
        this.mobile = builder.mobile;
        this.completedDegree = builder.completedDegree;
        this.staffStatus = builder.staffStatus;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getMobile() {
        return mobile;
    }

    public String getCompletedDegree() {
        return completedDegree;
    }

    public String getStaffStatus() {
        return staffStatus;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", emailAddress='" + emailAddress + '\'' +
                ", mobile='" + mobile + '\'' +
                ", completedDegree='" + completedDegree + '\'' +
                ", staffStatus='" + staffStatus + '\'' +
                '}';
    }

    public static class StaffBuilder {

        private int staffId;

        private final String firstName;

        private final String lastName;

        private Gender gender;

        private LocalDate dateOfBirth;

        private String emailAddress;

        private String mobile;

        private String completedDegree;

        private String staffStatus;

        public StaffBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public StaffBuilder withGender(Gender gender){
            this.gender = gender;
            return this;
        }

        public StaffBuilder withDateOfBirth(LocalDate localDate){
            this.dateOfBirth = localDate;
            return this;
        }

        public StaffBuilder withEmailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public StaffBuilder withMobile(String mobile){
            this.mobile = mobile;
            return this;
        }

        public StaffBuilder withCompletedDegree(String completedDegree){
            this.completedDegree = completedDegree;
            return this;
        }

        public StaffBuilder withStaffStatus(String staffStatus){
            this.staffStatus = staffStatus;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }

    }
}
