package org.madrona.core.service;

import org.madrona.common.House;
import org.madrona.common.enumz.HouseColor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml"})
public class HouseServiceTest {

    @Autowired
    private HouseService houseService;

    @Test
    public void testSaveHouse() throws Exception {
        House house = new House();
        house.setName("Eagle");
        house.setColor(HouseColor.BLUE);

        boolean isSaved = houseService.save(house);
        Thread.sleep(1000);
        Assert.assertEquals(true, isSaved);

        House house1 = houseService.get(1);
        Thread.sleep(1000);
        Assert.assertEquals("Eagle", house1.getName());

    }
}