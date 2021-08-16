package com.epam.atmp.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class TestDataReader {

    public static String getTestData(String key) {

        Properties properties = null;

        try {
            FileReader reader = new FileReader("./src/main/resources/user.properties");

            properties = new Properties();
            properties.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

}
