package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POF {

	public HomePage_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menuUser")
	private WebElement linkLogin;
	
	@FindBy(xpath = "//header//li[3]")
	private WebElement logged;

	@FindBy(id = "uselaptopsImg")
	private WebElement laptop;

	@FindBy(id = "headphonesTxt")
	private WebElement headPhones;

	public void getLinkLogin() {
		linkLogin.click();
	}
	
	public String getLogged() {
		return logged.getText();
	}

	public void getLapTop() {
		laptop.click();
	}

	public void getHeadPhones() {
		headPhones.click();
	}

}
