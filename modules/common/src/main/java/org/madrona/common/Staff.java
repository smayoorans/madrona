package org.madrona.common;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.madrona.common.enumz.Gender;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "staff")
public class Staff extends BaseEntity {

    @Column(name = "first_name")
    private final String firstName;

    @Column(name = "last_name")
    private final String lastName;

    @Column(name = "gender")
    private final Gender gender;

    @Column(name = "date_of_birth")
    private final Date dateOfBirth;

    @Column(name = "email_address")
    private final String emailAddress;

    @Column(name = "mobile_number")
    private final String mobile;

    @Column(name = "completed_degree")
    private final String completedDegree;

    @Column(name = "staff_status")
    private final String staffStatus;

    private Staff(StaffBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
        this.emailAddress = builder.emailAddress;
        this.mobile = builder.mobile;
        this.completedDegree = builder.completedDegree;
        this.staffStatus = builder.staffStatus;
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

    public Date getDateOfBirth() {
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
                "staffId=" + id +
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

        private final String firstName;
        private final String lastName;
        private Gender gender;

        private Date dateOfBirth;

        private String emailAddress;

        private String mobile;

        private String completedDegree;

        private String staffStatus;

        public StaffBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


        public StaffBuilder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public StaffBuilder withDateOfBirth(Date localDate) {
            this.dateOfBirth = localDate;
            return this;
        }

        public StaffBuilder withEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public StaffBuilder withMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public StaffBuilder withCompletedDegree(String completedDegree) {
            this.completedDegree = completedDegree;
            return this;
        }

        public StaffBuilder withStaffStatus(String staffStatus) {
            this.staffStatus = staffStatus;
            return this;
        }

        public Staff build() {
            return new Staff(this);
        }

    }
}
