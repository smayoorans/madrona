package org.madrona.core.service;

import org.junit.Assert;
import org.madrona.common.Grade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml"})
public class GradeServiceTest {

    private static final Logger logger = LogManager.getLogger(GradeServiceTest.class);

    @Autowired
    private GradeService gradeService;

    @Test
    public void testHouseInsert() throws Exception {

        logger.debug("Running Test Case [testHouseInsert]");

        Grade grade = new Grade();
        grade.setGradeName("2GD");
        grade.setGradeTeacher("Charles Sir");

        boolean isSaved = gradeService.save(grade);

        Assert.assertEquals(true, isSaved);
    }


}