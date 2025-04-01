package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
    String actualValue="Geethma";

    @Test(priority = 0)
    public void valuesEqualCheck(){
        /*if (name.equals("Geethma")){
            System.out.println("Name is equal.");
        }else {
            System.out.println("Name is not equal.");
        }*/
        String expectedValue="Geethma";
        System.out.println("Prior to equalsCheck assertion ");
        Assert.assertEquals(actualValue,expectedValue,"Value miss matched");
        System.out.println("After equalsCheck assertion ");
    }

}
