package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        dryRun = false,
        glue = "com/vytrack/step_definitions",
        tags = "@wip"


        //dryRun = false, //
        //tags = "@login and not @smoke" // to run only scenarios that have both tags at a time.
        //run a scenario that matches either of 2 tags: tags = "@tag1 or tag2"
        //tags = "@tag1 and not @tag2" means that run @tag1 scenarios and exclude @tag2 scenarios


)
public class CukesRunner {

}
