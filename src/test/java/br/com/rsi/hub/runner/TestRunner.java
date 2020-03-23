package br.com.rsi.hub.runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = {"br.com.rsi.hub.stepDefinition"},
		monochrome = true,
		plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
		snippets = SnippetType.CAMELCASE
		)

public class TestRunner {
//	@AfterClass
//	public static void  ExtentReport() {
//	Reporter.loadXMLConfig(new File("configs/extension-config.xml"));
//	}

}
