package Com.Test.Neelu;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Features", glue={"StepDefinition"},
        monochrome = true,
        plugin = {"pretty", "html:target/Reports"}
       // tags = "@scenario2"

       )

public class Runner {
}
