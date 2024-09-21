package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// using tags for running tagged scenarios --> tags = "@Smoke/@All etc.." (! will not work with tags + tagged hooks)
// to not run of scenario use --> not @dev/not @wip/not @ignore
@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features",
				glue = {"stepdefinitions","hooks"},
				plugin = {"pretty","html:target/CucumberReports/CucumberHTMLReport.html",
						"json:target/CucumberReports/CucmberJSON.json",
						"junit:target/CucumberReports/CucmberXML.xml"}
				)
public class TestRunner {

	
}
