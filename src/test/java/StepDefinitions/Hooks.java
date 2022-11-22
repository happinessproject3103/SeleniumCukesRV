package StepDefinitions;

import Utilities.GenericWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    @Before
    public void before()
    {
        System.out.println("In Before Hook");
    }

    @After
    public void after()
    {
            GenericWebDriver.quitDriver();
    }
}
