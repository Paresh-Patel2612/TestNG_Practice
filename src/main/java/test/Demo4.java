package test;

import org.testng.annotations.Test;

public class Demo4 {
    @Test (enabled = false)
    public void CarGear(){
        System.out.println("Car Gear");
    }

    @Test (timeOut = 4000)
    public void CarDashboard(){
        System.out.println("Car Dashboard");
    }

    @Test (dependsOnMethods = {"CarDashboard","CarLight"})
    public void CarColor(){
        System.out.println("Car Color");
    }

    @Test
    public void CarLight(){
        System.out.println("Car Light");
    }
}
