package testNG;

import org.testng.annotations.Test;

public class DependsOnTest {
    @Test
    public void oLevel(){
        System.out.println("O/Level");
    }

    @Test
    public void aLevel(){
        System.out.println("A/Level");
    }

    @Test
    public void campus(){
        System.out.println("Campus");
    }
}
