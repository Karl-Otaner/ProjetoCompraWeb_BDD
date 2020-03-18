package br.com.rsi.hub.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = "br.com.rsi.hub.stepDefinition",
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		)

public class TestRunner {
	

}
