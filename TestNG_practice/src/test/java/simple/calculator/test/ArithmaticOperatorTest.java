package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import simple.calculator.ArithmaticOperator;

public class ArithmaticOperatorTest {
    SoftAssert softAssert=new SoftAssert();

    @Test(priority = 0)
    public void testSum(){
        System.out.println("************First test case for calSum************");
        System.out.println("<<<<<<<<<<<<First sum calculation>>>>>>>>>>>>>");
        int actualValueSum1= ArithmaticOperator.calSum(20,5);
        System.out.println("Actual value sum is: "+actualValueSum1);
        //Assert.assertEquals(actualValueSum1,25,"Failed to calc sum 1");
        //softAssert.assertEquals(actualValueSum1,25,"Failed to calc sum 1");
        softAssert.assertEquals(actualValueSum1,26,"Failed to calc sum 1");

        System.out.println("<<<<<<<<<<<<Second sum calculation>>>>>>>>>>>>>");
        int actualValueSum2= ArithmaticOperator.calSum(10,20);
        System.out.println("Actual sum2 value is: "+actualValueSum2);
        //Assert.assertEquals(actualValueSum2,30,"Failed to calc sum 2");
        softAssert.assertEquals(actualValueSum2,30,"Failed to calc sum 2");

        System.out.println("<<<<<<<<<<<<Third sum calculation>>>>>>>>>>>>>");
        int actualValueSum3= ArithmaticOperator.calSum(4,8);
        System.out.println("Actual sum3 value is: "+actualValueSum3);
        //Assert.assertEquals(actualValueSum3,12,"Failed to calc sum 3");
        softAssert.assertEquals(actualValueSum3,12,"Failed to calc sum 3");
        System.out.println();
        System.out.println();
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void testSubtraction(){
        System.out.println("************Second test case for calSubtraction************");
        System.out.println("<<<<<<<<<<<<First subtraction calculation>>>>>>>>>>>>>");
        int actualValueSub1= ArithmaticOperator.calSubtraction(20,5);
        System.out.println("Actual subtraction01 value is: "+actualValueSub1);
        //Assert.assertEquals(actualValueSum2,30,"Failed to calc sum 2");
        Assert.assertEquals(actualValueSub1,15,"Failed to calc sub 1");

        System.out.println("<<<<<<<<<<<<Second subtraction calculation>>>>>>>>>>>>>");
        int actualValueSub2= ArithmaticOperator.calSubtraction(30,5);
        System.out.println("Actual subtraction01 value is: "+actualValueSub2);
        //Assert.assertEquals(actualValueSum2,30,"Failed to calc sum 2");
        Assert.assertEquals(actualValueSub2,25,"Failed to calc sub 2");
    }
}
