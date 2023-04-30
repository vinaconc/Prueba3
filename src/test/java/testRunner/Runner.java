package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {"stepDefinition"}, plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
	      "junit:target/cucumber-reports/Cucumber.xml",
	      "html:target/cucumber-reports"},
monochrome = true, strict = true, dryRun= false	)	
public class Runner {
}
