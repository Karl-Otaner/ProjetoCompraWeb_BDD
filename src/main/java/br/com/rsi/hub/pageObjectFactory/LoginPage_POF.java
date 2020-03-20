package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsi.hub.Utility.MassOfData;

public class LoginPage_POF {
	
//	WebDriver driver;
	public MassOfData mass;
	
	
	public LoginPage_POF(WebDriver driver) {
//		this.driver = driver;
		mass = new MassOfData();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "username")
	private WebElement userName;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement passWord;
	
	@FindBy(how = How.ID, using = "sign_in_btnundefined")
	private WebElement btnSignIn;
	
	
	public void userName() throws Exception {
		userName.sendKeys(mass.userName());
	}
	
	public void passWord() throws Exception {
		passWord.sendKeys(mass.passWord());
	}
	
	public void btnSignIn() {
		btnSignIn.click();
	}
	
		

}
