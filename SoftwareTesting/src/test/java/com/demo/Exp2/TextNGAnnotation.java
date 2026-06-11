package com.demo.Exp2;

import org.testng.annotations.*;

public class TextNGAnnotation {
    @BeforeSuite
    public void  BeforeSuite() {
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void  BeforeTest() {
        System.out.println("Before Test");
    }
    @BeforeClass
    public void  BeforeClass() {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("Before Method");
    }
    @AfterSuite
    public void  AfterSuite() {
        System.out.println("After Suite");
    }
    @AfterTest
    public void  AfterTest() {
        System.out.println("After Test");
    }
    @AfterClass
    public void AfterClass() {
        System.out.println("After Class");
    }
    @AfterMethod
    public void AfterMethod() {
        System.out.println("After Method");
    }
    @Test
    void Test1() {
        System.out.println("Testcase 1");
    }
    @Test
    void Test2() {
        System.out.println("Testcase 2");
    }
    @Test
    void Test3() {
        System.out.println("Testcase 3");
    }
    @Test
     void Test4() {
        System.out.println("Testcase 4");
    }
}
