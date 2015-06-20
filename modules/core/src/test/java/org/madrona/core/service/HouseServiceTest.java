package org.madrona.core.service;

import com.madrona.common.model.Address;
import com.madrona.common.model.Gender;
import com.madrona.common.model.House;
import com.madrona.common.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml"})
public class HouseServiceTest {

    private static final Logger logger = LogManager.getLogger(HouseServiceTest.class);

    @Autowired
    private HouseService houseService;

    @Test
    public void testHouseInsert() throws Exception {

        logger.debug("Running Test Case [testHouseInsert]");

        House house = new House();
        house.setHouseName("Barathy");
        house.setHouseColor("Blue");
        house.setCreateDate(new Date());


        houseService.insert(house);


        System.out.println("house " + house);
    }


}