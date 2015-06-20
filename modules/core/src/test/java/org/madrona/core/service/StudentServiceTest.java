package org.madrona.core.service;

import com.madrona.common.model.Address;
import com.madrona.common.model.Gender;
import com.madrona.common.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml"})
public class StudentServiceTest {

    private static final Logger logger = LogManager.getLogger(StudentServiceTest.class);

    @Autowired
    private StudentService studentService;

    @Test
    public void testAddStudentWithAddress() throws Exception {

        logger.debug("Running Test Case [testAddStudentWithAddress]");

        Student student1 = new Student();
        student1.setFirstName("Mayooran");
        student1.setLastName("Somasundaram");
        student1.setEmailAddress("smayoorans@gmail.com");
        student1.setGender(Gender.MALE);
//        Default DateTimeFormatter.ISO_LOCAL_DATE
        student1.setDateOfBirth(LocalDate.parse("1987-07-02"));
        student1.setJoinedDate(LocalDate.parse("2012-10-22"));

        Address address1 = new Address();
        address1.setHouseNumber("No 320");
        address1.setAddressLine1("2nd Floor");
        address1.setAddressLine2("T.B Jayah Mawatha");
        address1.setDistrict("Colombo");
        address1.setProvince("Western");
        student1.setHomeAddress(address1);
        address1.setStudent(student1);
        studentService.insert(student1);

        Student student2 = new Student();
        student2.setFirstName("Shanya");
        student2.setLastName("Somasundaram");
        student2.setEmailAddress("shanyas@gmail.com");
        student2.setGender(Gender.FEMALE);
        student2.setDateOfBirth(LocalDate.parse("1991-11-11"));
        student2.setJoinedDate(LocalDate.parse("2012-02-23"));

        Address address2 = new Address();
        address2.setHouseNumber("No 2/3");
        address2.setAddressLine1("Ward No 7");
        address2.setAddressLine2("Velanai West");
        address2.setDistrict("Jaffna");
        address2.setProvince("Northern");
        address2.setStudent(student2);

        student2.setHomeAddress(address2);
        studentService.insert(student2);


        Thread.sleep(2000);

        Student student = studentService.getStudent(1);

        System.out.println("Student " + student);
    }


}