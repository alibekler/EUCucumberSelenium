package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("This is coming from BEFORE");
    }

    @After
    public void teardown() {
        Driver.closeDriver();
    }

    @Before("@db")
    public void setupDb() {
        System.out.println("connecting to database");
    }

    @After("@db")
    public void teardownDb() {
        Driver.closeDriver();
    }
}
