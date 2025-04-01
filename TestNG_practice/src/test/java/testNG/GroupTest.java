package testNG;

import org.testng.annotations.Test;

public class GroupTest {
    //S= smoke , R= Regression
    @Test
    public void test01(){
        System.out.println("This is smoke and regression test case");
    }

    @Test
    public void test02(){
        System.out.println("This is regression test case");
    }

    @Test
    public void test03(){
        System.out.println("This is not smoke or regression");
    }

    @Test
    public void test04(){
        System.out.println("This is smoke test case");
    }

    @Test
    public void test05(){
        System.out.println("This is smoke and regression test case");
    }
}
