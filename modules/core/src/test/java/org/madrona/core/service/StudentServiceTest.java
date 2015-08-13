package org.madrona.core.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.madrona.common.Address;
import org.madrona.common.Student;
import org.madrona.common.enumz.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class StudentServiceTest {

    private static final Logger logger = LogManager.getLogger(StudentServiceTest.class);

    @Autowired
    private StudentService studentService;

    @Test
    public void testSaveStudentWithAddress() throws Exception {

        logger.debug("Running Test Case [testSaveStudentWithAddress]");

        Student mayooran = new Student();
        mayooran.setStudentName("Mayooran");
        mayooran.setEmailAddress("smayoorans@gmail.com");

        mayooran.setGender(Gender.MALE);
        mayooran.setDateOfBirth(new Date());
        mayooran.setJoinedDate(new Date());

        Address address = new Address();
        address.setHouseNumber("No 320");
        address.setAddressLine1("2nd Floor");
        address.setAddressLine2("T.B Jayah Mawatha");
        address.setDistrict("Colombo");
        address.setProvince("Western");
        address.setStudent(mayooran);
        mayooran.setHomeAddress(address);
        boolean isSaved = studentService.save(mayooran);

        Assert.assertEquals(true, isSaved);
        Thread.sleep(1000);

        Assert.assertEquals("Western", mayooran.getHomeAddress().getProvince());

        Student student = studentService.get(1);
        Assert.assertNotNull(student);
    }
}