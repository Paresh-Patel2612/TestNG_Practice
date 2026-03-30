package test;

import org.testng.annotations.*;

public class Demo1 {

    @BeforeClass
    public void BF_Class(){
        System.out.println("Before Class Print....");
    }

    @Test (groups = {"Smoke"})
    public void Loan_One(){
        System.out.println("Loan One");
    }

    @Test
    public void Loan_Two(){
        System.out.println("Loan Two");
    }

    @AfterClass
    public void AF_Class(){
        System.out.println("After Class Print....");
    }

    @Test
    public void Loan_Three(){
        System.out.println("Loan Three");
    }

    @Test
    public void demo(){
        System.out.println("Not Executed");
    }

    @AfterTest
    public void AF_Suite(){
        System.out.println("After Suite");
    }

    @BeforeMethod
    public void BF_Method(){
        System.out.println("Before Method");
    }
}
