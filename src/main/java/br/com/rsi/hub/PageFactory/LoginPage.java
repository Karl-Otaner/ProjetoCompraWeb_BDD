package br.com.rsi.hub.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement userName;
	
	@FindBy(name = "password")
	private WebElement passWord;
	
	@FindBy(id = "sign_in_btnundefined")
	private WebElement btnSignIn;
	
	
	public void 
	
		

}
