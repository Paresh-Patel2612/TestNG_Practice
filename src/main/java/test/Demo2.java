package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
    @Test
    public void EV(){
        System.out.println("EV");
    }

    @AfterTest
    public void Car(){
        System.out.println("Car");
    }

    @BeforeTest
    public void Bike(){
        System.out.println("Bike");
    }
}
