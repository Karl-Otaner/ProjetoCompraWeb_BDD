package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.rsi.hub.Utility.MassOfData;

public class LoginPage_POF {
	
//	private WebDriver driver;
	public MassOfData mass;
	
	
	public LoginPage_POF(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement userName;
	
	@FindBy(name = "password")
	private WebElement passWord;
	
	@FindBy(id = "sign_in_btnundefined")
	private WebElement btnSignIn;
	
	
	public void getUserName() throws Exception {
		userName.sendKeys(mass.userName());
	}
	
	public void getPassWord() throws Exception {
		passWord.sendKeys(mass.passWord());
	}
	
	public WebElement getBtnSignIn() {
		return btnSignIn;
	}
	
		

}
