package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
    SoftAssert softAssert=new SoftAssert();
    String actualValue="Geethma";

    @Test(priority = 0)
    public void valuesEqualCheck(){
        /*if (name.equals("Geethma")){
            System.out.println("Name is equal.");
        }else {
            System.out.println("Name is not equal.");
        }*/
        String expectedValue="Geethma";
        //String expectedValue="Geethma123";
        System.out.println("Prior to equalsCheck assertion ");
        Assert.assertEquals(actualValue,expectedValue,"Value miss matched");
        System.out.println("After to equalsCheck assertion ");
    }

    @Test(priority = 1)
    public void valuesNotEqualCheck(){
        String expectedValue="Learning TestNG";
        System.out.println("Prior to valuesNotEqualCheck assertion ");
        Assert.assertNotEquals(actualValue,expectedValue,"Value matched");
        System.out.println("After to valuesNotEqualCheck assertion ");
    }

    @Test(priority = 2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck assertion ");
        Assert.assertTrue(actualValue.startsWith("G"),"Condition return a false");
        System.out.println("After to trueConditionCheck assertion ");
    }

    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck assertion ");
        Assert.assertFalse(actualValue.isBlank(),"Condition return a true");
        System.out.println("After to falseConditionCheck assertion ");
    }

}
