package org.madrona.core.service;

import com.madrona.common.model.Address;
import com.madrona.common.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml"})
public class StudentServiceTest {

    private static final Logger logger = LogManager.getLogger(StudentServiceTest.class);

    @Autowired
    private StudentService studentService;

    @Test
    public void testAddStudent() throws Exception {
        logger.info("Running Insert student test case");
        Address address = new Address();
        address.setAddressLine1("H1dfdf");
        address.setHouseNumber("1233");


        Student student = new Student();
        student.setFirstName("Mayoorandfdf");
        student.setEmailAddress("Somasunddfsdffaram");

        student.setHomeAddress(address);
        address.setStudent(student);
        studentService.addStudent(student);

//        Student studentById = studentService.getStudentById(student.getId());
//        assertEquals("Mayooran", studentById.getFirstName());
        logger.info("Student details inserted");
    }
}