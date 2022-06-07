package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void log() {
        logger = Logger.INSTANCE;
        logger.log("#1 - 07.06.2022");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String log = logger.getLastLog();
        System.out.println("Last log: " + log);
        //Then
        assertEquals("#1 - 07.06.2022", log);
    }
}
