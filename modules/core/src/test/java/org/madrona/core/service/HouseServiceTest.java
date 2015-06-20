package org.madrona.core.service;

import com.madrona.common.model.House;
import com.madrona.common.model.enumz.HouseColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
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

    @Autowired
    private HouseService houseService;

    @Test
    public void testHouseInsert() throws Exception {
        House house = new House();
        house.setHouseName("Eagle");
        house.setHouseColor(HouseColor.BLUE);
        house.setCreateDate(LocalDate.now());
        houseService.insert(house);
        Thread.sleep(1000);


        House house1 = houseService.get(1);
        Assert.assertEquals("Eagle", house1.getHouseName());

        Thread.sleep(2000);


    }



}