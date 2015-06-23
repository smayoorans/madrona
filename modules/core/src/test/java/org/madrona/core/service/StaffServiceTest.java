package org.madrona.core.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.madrona.common.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class StaffServiceTest {

    private static final Logger logger = LogManager.getLogger(StaffServiceTest.class);

    @Autowired
    private StaffService staffService;

    @Test
    public void testAddStaff() throws Exception {

        logger.debug("Running Test Case [testAddStudentWithAddress]");

        Staff staff = new Staff.StaffBuilder("Mayooran", "Somasundaram")
                .withCompletedDegree("Bsc")
                .build();

        staffService.insert(staff);
        Thread.sleep(1000);

    }


}