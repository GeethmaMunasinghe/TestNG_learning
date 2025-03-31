package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotation1 {
    public static void main(String[] args) {
        System.out.println("This is not a testNG test01");
        TestNGAnnotation1 test=new TestNGAnnotation1();
        test.notATestNGMethod();
    }

    public void notATestNGMethod(){
        System.out.println("This is not a testNG method test 02");
    }

    @Test
    public void test(){
        System.out.println("This is testNG method");
    }
}
