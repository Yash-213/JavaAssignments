package com.demo.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {
    @Test
    void testTitle(){
        String expected = "OpenCart";
        //String Actual = "OpenShot";
        String Actual = "OpenCart";

        Assert.assertEquals(expected, Actual);
        Assert.assertTrue(1 == 2);
        Assert.assertNull(null);
        System.out.println("Hello World");
    }
}
