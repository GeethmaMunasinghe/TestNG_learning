package testNG.Parameter;

import org.testng.annotations.Test;

public class ParameterTest01 {
    @Test
    public void Sum(int v1,int v2){
        int finalsum=v1+v2;
        System.out.println("The final sum of the given values: "+finalsum);
    }
}
