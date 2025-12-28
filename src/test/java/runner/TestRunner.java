package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "/steps",
        tags = "@login",
        plugin = { "pretty", "html:target/site/cucumber-pretty.html",
             "json:target/cucumber.json" }
)
public class TestRunner {
}
