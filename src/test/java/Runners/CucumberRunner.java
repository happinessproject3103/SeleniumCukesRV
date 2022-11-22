package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        plugin = {"pretty", "html:target/cucumber/cucumber.json", "json:target/cucumber-reports/cucumber.json"},
        glue={"StepDefinitions"}
        //Uncomment below to run specific tags
        //,tags = "(@Login or @BillPayment or @SavingsAccount) and not @NegativeScenario"
)
public class CucumberRunner {

}