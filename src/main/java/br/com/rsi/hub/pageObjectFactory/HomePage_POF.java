package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsi.hub.Utility.MassOfData;
import br.com.rsi.hub.dataProvider.ConfigFileReader;

public class HomePage_POF {
	private WebDriver driver;
	public MassOfData mass;
	
	public HomePage_POF(WebDriver driver) {
		this.driver = driver;
		mass = new MassOfData();
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement linkLogin;
	
	@FindBy(how = How.NAME, using = "username")
	private WebElement userName;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement passWord;
	
	@FindBy(how = How.ID, using = "sign_in_btnundefined")
	private WebElement btnSignIn;
	
	@FindBy(how = How.ID, using = "headphonesImg")
	private WebElement headPhonesImg;


	
	public void linkLogin() {
		linkLogin.click();
	}
	public void userName() throws Exception {
		userName.sendKeys(mass.userName());
	}
	
	public void passWord() throws Exception {
		passWord.sendKeys(mass.passWord());
	}
	
	public void btnSignIn() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnSignIn);
	}
	
	public void headPhonesImg() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", headPhonesImg);
	}


}
