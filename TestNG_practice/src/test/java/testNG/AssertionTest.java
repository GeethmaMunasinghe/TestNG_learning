package testNG;

import org.testng.annotations.Test;

public class AssertionTest {
    String name="Geethma";

    @Test
    public void valuesEqualCheck(){
        if (name.equals("Geethma")){
            System.out.println("Name is equal.");
        }else {
            System.out.println("Name is not equal.");
        }
    }
}
