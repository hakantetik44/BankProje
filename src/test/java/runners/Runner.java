package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//"json:target/json-reports/cucumber.json"
//html:target/cucumber-reports
@CucumberOptions (



       strict = true,


        plugin={"html:target/cucumber-reports.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},

        features="src/test/resources/features",
        glue="stepdefinitions" ,
        tags=  "@gmi",


        dryRun= false



     



        // dryRun=true dedigimizde testi calistirmadan bize eksik adimi verir

        // dryRun=false yaparsak testi calistirir, eksik bir adimla karsilasirsa

        // test failed olur ve bize eksik adimi raporlar

)



public class Runner {

}