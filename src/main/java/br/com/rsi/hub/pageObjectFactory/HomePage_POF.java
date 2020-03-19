package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsi.bdd.dataProvider.ConfigFileReader;

public class HomePage_POF {
	WebDriver driver;
//	ConfigFileReader configFileReader;

	public HomePage_POF(WebDriver driver) {
		this.driver = driver;
//		configFileReader = new ConfigFileReader();
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement linkLogin;
	
	@FindBy(how = How.XPATH, using = "//header//li[3]")
	private WebElement logged;

	@FindBy(how = How.ID, using = "uselaptopsImg")
	private WebElement laptop;

	@FindBy(how = How.ID, using = "headphonesTxt")
	private WebElement headPhones;

	public void linkLogin() {
		linkLogin.click();
	}
	
	public String logged() {
		return logged.getText();
	}

	public void lapTop() {
		laptop.click();
	}

	public void headPhones() {
		headPhones.click();
	}

}
