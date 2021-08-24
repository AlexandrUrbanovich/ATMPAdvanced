package com.epam.atmp.service;

import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class TestDataReader {

    private static final Logger LOGGER = Logger.getLogger(TestDataReader.class);

    public static String getTestData(String key) {

        Properties properties = null;

        try {
            FileReader reader = new FileReader("./src/main/resources/user.properties");

            properties = new Properties();
            properties.load(reader);

            LOGGER.info("Test data has been read.");
        } catch (FileNotFoundException e) {
            LOGGER.error("FileNotFoundException", e);
        } catch (IOException e) {
            LOGGER.error("IOException", e);
        }
        return properties.getProperty(key);
    }

}
