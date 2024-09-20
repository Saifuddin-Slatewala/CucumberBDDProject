package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// using tags for running tagged scenarios --> tags = "@Smoke/@All etc.." (! will not work with tags + tagged hooks)

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"})
public class MyRunner {

}
