package br.com.rsi.bdd.manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsi.hub.Utility.ConstantExcel;

public class WebDriverManager {
	private WebDriver driver;
	
	public WebDriver createDriver() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(ConstantExcel.URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	public WebDriver  killDriver() {
		if (driver != null) {
			driver.quit();
		}
		return driver = null;
	}
	

}
