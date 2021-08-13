package com.epam.atmp.service;

import com.epam.atmp.model.User;


public class UserCreator {

    public static final String DEFAULT_USER_NAME = "default.user.name";
    public static final String DEFAULT_PASSWORD = "default.password";

    public static final String ADMIN_USER_NAME = "admin.user.name";
    public static final String ADMIN_PASSWORD = "admin.password";

    public static User defaultUser() {
        return new User(TestDataReader.getTestData(DEFAULT_USER_NAME), TestDataReader.getTestData(DEFAULT_PASSWORD));
    }

    public static User adminUser() {
        //TODO
        return new User(ADMIN_USER_NAME, ADMIN_PASSWORD);
    }
}
