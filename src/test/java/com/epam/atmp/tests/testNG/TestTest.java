package com.epam.atmp.tests.testNG;

import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


@Listeners({ReportPortalTestNGListener.class})
public class TestTest{

    @Test
    public void Test () {
        assertTrue(true, String.valueOf(true));
    }

}
