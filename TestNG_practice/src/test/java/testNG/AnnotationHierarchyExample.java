package testNG;

import org.testng.annotations.*;

public class AnnotationHierarchyExample {
    @Test
    public void test01() {
        System.out.println("I'm test01");
    }
    @Test
    public void test02() {
        System.out.println("I'm test02");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I'm before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I'm after method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I'm before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I'm after class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I'm before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I'm after test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I'm before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("I'm after suite");
    }
}
