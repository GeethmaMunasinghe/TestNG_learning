package testNG.Parameter;


public class ParameterTest03 {

    public void browserExecution(String browser){
        System.out.println("TestNG xml file passed browser value is :"+browser);
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("Browser should open with : chrome.");
        }else if (browser.equalsIgnoreCase("edge")){
            System.out.println("Browser should open with : edge.");
        }else {
            System.out.println("Browser should open with : Firefox");
        }
    }
}
