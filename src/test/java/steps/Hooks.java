package steps;

import cucumber.api.java.After;
import utilities.Driver;

public class Hooks {

    //All and ONLY After actions will be here

    @After
    public void tearDown(){
        Driver.quitDriver();
    }
}