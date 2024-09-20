package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// using tags for running tagged scenarios --> tags = "@Smoke/@All etc.." (! will not work with tags + tagged hooks)
// to not run of scenario use --> not @dev/not @wip/not @ignore
@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features",
				glue = "stepdefinitions",
				plugin = {"pretty","html:target/CucumberHTMLReport.html"},tags ="@Smoke"
				)
public class TestRunner {

	
}
