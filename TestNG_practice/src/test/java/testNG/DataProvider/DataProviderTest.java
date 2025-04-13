package testNG.DataProvider;

public class DataProviderTest {

    public Object [][] getData(){
        Object[][] data= {
                {"abc@gmail.com","abc123"},{"def@gmail.com","abc123"},{"xyz@gmail.com","xyz123"}
        };
        return data;
    }
}
