package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("This is coming from BEFORE");
    }

    @After
    public void teardown(){
        System.out.println("This is coming from AFTER");
    }

    @Before("@db")
    public void setupDb(){
        System.out.println("connecting to database");
    }

    @After("@db")
    public void teardownDb(){
        System.out.println("disconnecting from database");
    }
}
