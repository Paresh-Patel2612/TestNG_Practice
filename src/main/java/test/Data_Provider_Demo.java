package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Demo {
    @Test(dataProvider = "GetData")
    public void User_Credentials(String UserName, String Password){
        System.out.println(UserName);
        System.out.println(Password);
    }

    @DataProvider
    public Object[][] GetData(){
        Object[][] data = new Object[4][2];

        data[0][0]= "Sagar";
        data[0][1]= "Abc123#";

        data[1][0]="Ankita";
        data[1][1]="Test@1234";

        data[2][0]="Krushna";
        data[2][1]="Test@Test123";

        data[3][0]="Paresh";
        data[3][1]="Qwe@1234";

        return data;
    }
}
