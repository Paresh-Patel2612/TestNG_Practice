package test;

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

    @Test
    public void CarDashboard(){
        System.out.println("CarDashboard");
    }
}
