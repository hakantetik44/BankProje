package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//"json:target/json-reports/cucumber.json"
//html:target/cucumber-reports
@CucumberOptions (
        strict = true,

        plugin={"html:target/Pcucumber-reports2.html",
                "json:target/cucumber-reports/Pcucumber2.json",
                "junit:target/xml-report/Pcucumber2.xml"},

        features="src/test/resources/features",
        glue="stepdefinitions" ,
        tags="@smoke" ,


        dryRun= false







)

public class SmokeTestRunner {

}
