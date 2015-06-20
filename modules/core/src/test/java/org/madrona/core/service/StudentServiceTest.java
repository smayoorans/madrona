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
        Address address = new Address();
        address.setHouseNumber("No 320");
        address.setAddressLine1("2nd Floor");
        address.setAddressLine2("T.B Jayah Mawatha");
        address.setDistrict("Colombo");
        address.setProvince("Western");


        Student student = new Student();
        student.setFirstName("Mayooran");
        student.setLastName("Somasundaram");
        student.setEmailAddress("smayoorans@gmail.com");
        student.setGender(Gender.FEMALE);
        student.setDateOfBirth(LocalDate.now());
        student.setJoinedDate(LocalDate.now());
        student.setHomeAddress(address);

        address.setStudent(student);
        studentService.addStudent(student);
        studentService.addStudent(student);


        Thread.sleep(2000);



        logger.info("Student details inserted");
    }
}