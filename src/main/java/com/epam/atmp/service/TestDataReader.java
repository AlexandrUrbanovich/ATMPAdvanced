package com.epam.atmp.service;

import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class TestDataReader {

    private static final Logger logger = Logger.getLogger(TestDataReader.class);

    public static String getTestData(String key) {

        Properties properties = null;

        try {
            FileReader reader = new FileReader("./src/main/resources/user.properties");

            properties = new Properties();
            properties.load(reader);

            logger.info("Test data has been read.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

}
