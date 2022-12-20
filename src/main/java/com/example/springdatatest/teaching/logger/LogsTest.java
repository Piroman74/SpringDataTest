package com.example.springdatatest.teaching.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogsTest {
    Logger logger = LoggerFactory.getLogger(LogsTest.class);

    public void logsTestMethod() {
        logger.info("log it");
    }
}
