package com.epam.atmp;

import com.epam.atmp.tests.testNG.LoginTest;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class ProgramRunner {

    public static void main(String args[]) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] {LoginTest.class});
        testng.addListener(tla);
        testng.run();

    }
}
