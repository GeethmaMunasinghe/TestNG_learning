package testNG.DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.test.ArithmaticOperator2;

public class ArithmeticOperatorDataProvider {
    @Test(dataProvider = "setOfData")
    public void testSum(int input1,int input2,int expectedValue){
        Assert.assertEquals(ArithmaticOperator2.calSum(input1,input2),expectedValue);
    }

    @DataProvider(name = "setOfData")
    public Object[][] getData(){
        Object[][] data={
                {0,1,1},
                {0,-1,-1},
                {-2189076,-1,-2189077},
                {2189076,1,2189077}
        };
        return data;
    }
}
