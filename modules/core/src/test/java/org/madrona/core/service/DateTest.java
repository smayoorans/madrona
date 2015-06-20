package org.madrona.core.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.time.LocalDate;


public class DateTest {

    private static final Logger logger = LogManager.getLogger(DateTest.class);

    @Test
    public void testLocalDateParse() throws Exception {
        LocalDate date = LocalDate.parse("1987-07-02");
        System.out.println(date.getMonth());

    }
}