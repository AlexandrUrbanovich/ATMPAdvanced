package com.epam.atmp.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class TestDataReader {

    public static String getTestData(String key) {
        try {
            FileReader reader = new FileReader("./src/main/resources/user.properties");

            Properties properties = new Properties();
            properties.load(reader);

            return properties.getProperty(key);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //TODO
        return key;
    }


}
