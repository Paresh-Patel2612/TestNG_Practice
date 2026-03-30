package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {
    @Test
    public void pr(){
        System.out.println("Excluded Demo 2 Class");
    }

    @Test
    public void CarGlass(){
        System.out.println("CarGlass");
    }

    @Test (groups = {"Smoke"})
    public void CarDashboard(){
        System.out.println("CarDashboard");
    }

    @BeforeSuite
    public void BF_Suite(){
        System.out.println("Before Suite");
    }

    @AfterMethod
    public void AF_Method(){
        System.out.println("After Method");
    }
}
