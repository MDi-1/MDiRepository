package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openLogFile() {
        System.out.println("\n]]]] Kodilla exercise 15.1 Singleton [[[[");
        logger = Logger.LOG_INST;
        logger.log("this is the log entry");
    }

    @Test
    void testGetLastLog() {
        //when
        String result = logger.getLastLog();
        //then
        assertEquals("this is the log entry", result);
    }
}
