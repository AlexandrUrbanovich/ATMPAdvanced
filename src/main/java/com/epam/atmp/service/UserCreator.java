package com.epam.atmp.service;

import com.epam.atmp.model.User;
import org.apache.log4j.Logger;

public class UserCreator {
    private static final Logger logger = Logger.getLogger(UserCreator.class);

    public static final String DEFAULT_USER_NAME = "default.user.name";
    public static final String DEFAULT_PASSWORD = "default.password";

    public static final String ADMIN_USER_NAME = "admin.user.name";
    public static final String ADMIN_PASSWORD = "admin.password";

    public static User defaultUser() {
        logger.info("Create default user.");
        return new User(TestDataReader.getTestData(DEFAULT_USER_NAME), TestDataReader.getTestData(DEFAULT_PASSWORD));
    }

    public static User adminUser() {
        logger.info("Create admin user.");
        return new User(TestDataReader.getTestData(ADMIN_USER_NAME), TestDataReader.getTestData(ADMIN_PASSWORD));
    }
}
