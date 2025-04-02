package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import simple.calculator.ArithmaticOperator;

public class ArithmaticOperatorTest {
    @Test(priority = 0)
    public void testSum(){
        System.out.println("************First test case for calSum************");
        System.out.println("<<<<<<<<<<<<First sum calculation>>>>>>>>>>>>>");
        int actualValueSum1= ArithmaticOperator.calSum(20,5);
        System.out.println("Actual value sum is: "+actualValueSum1);
        Assert.assertEquals(actualValueSum1,25,"Failed to calc sum 1");

        System.out.println("<<<<<<<<<<<<Second sum calculation>>>>>>>>>>>>>");
        int actualValueSum2= ArithmaticOperator.calSum(10,20);
        System.out.println("Actual sum2 value is: "+actualValueSum2);
        Assert.assertEquals(actualValueSum2,30,"Failed to calc sum 2");

        System.out.println("<<<<<<<<<<<<Third sum calculation>>>>>>>>>>>>>");
        int actualValueSum3= ArithmaticOperator.calSum(4,8);
        System.out.println("Actual sum3 value is: "+actualValueSum3);
        Assert.assertEquals(actualValueSum3,12,"Failed to calc sum 3");
        System.out.println();
        System.out.println();

    }
}
