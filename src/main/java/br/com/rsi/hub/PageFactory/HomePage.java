package br.com.rsi.hub.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menuUser")
	private WebElement linkLogin;

	@FindBy(id = "uselaptopsImg")
	private WebElement laptop;

	@FindBy(id = "headphonesTxt")
	private WebElement headPhones;

	public void getLinkLogin() {
		linkLogin.click();
	}

	public void getLapTop() {
		laptop.click();
	}

	public void getHeadPhones() {
		headPhones.click();
	}

}
