package br.com.rsi.hub.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsi.hub.context.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private TestContext context;

	public Hooks(TestContext context) {
		this.context = context;
	}

	@Before
	public void createDriverConfigsTest() throws Exception {
		context.getDriverManager().createDriver();
	}

	@After(order = 1)

	public void afterCenario(Scenario scenario) throws Exception {

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			File sourcePath = ((TakesScreenshot) context.getDriverManager().createDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}

	}

	@After(order = 0)
	public void killConfigsTest() {
		context.getDriverManager().killDriver();
	}

}
