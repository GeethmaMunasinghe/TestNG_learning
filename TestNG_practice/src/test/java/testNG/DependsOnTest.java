package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {
    @Test(priority = 0)
    public void oLevel(){
        System.out.println("O/Level");
        //Assert.fail();
    }

    //@Test(dependsOnMethods = "oLevel")
    @Test(priority = 1)
    public void aLevel(){
        System.out.println("A/Level");
    }

    //@Test(dependsOnMethods = {"oLevel","aLevel"},alwaysRun = true)
    @Test(priority = 2)
    public void campus(){
        System.out.println("Campus");
    }
}
