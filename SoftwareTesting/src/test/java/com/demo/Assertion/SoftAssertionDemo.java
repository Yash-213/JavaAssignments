package com.demo.Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
    @Test
    public void testTitle() {
        System.out.println("test");
        System.out.println("test");
        SoftAssert sc = new SoftAssert();
        sc.assertEquals(1, 2);
        System.out.println("testing...");
        System.out.println("testing...");
        sc.assertAll();
    }
}
