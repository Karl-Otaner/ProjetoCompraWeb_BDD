package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsi.hub.dataProvider.ConfigFileReader;

public class HomePage_POF {
	WebDriver driver;

	public HomePage_POF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement linkLogin;
	
	@FindBy(how = How.XPATH, using = "//header//li[3]")
	private WebElement logged;

	@FindBy(how = How.ID, using = "laptopsImg")
	private WebElement laptop;

	@FindBy(how = How.ID, using = "headphonesImg")
	private WebElement headPhones;
	
	@FindBy(how = How.ID, using = "menuCart")
	private WebElement menuCart;

	public void linkLogin() {
		linkLogin.click();
	}
	
	public String logged() {
		return logged.getText();
	}

	public void lapTop() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(laptop));
		laptop.click();
	}

	public void headPhones() {
		headPhones.click();
	}
	
	public void menuCart() {
		menuCart.click();
	}

}
