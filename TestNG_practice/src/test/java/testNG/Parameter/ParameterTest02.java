package testNG.Parameter;

import org.testng.annotations.Test;

public class ParameterTest02 {
    @Test
    public void Diff(int v1,int v2){
        int finalDiff=v1-v2;
        System.out.println("Final value ");
    }
}
