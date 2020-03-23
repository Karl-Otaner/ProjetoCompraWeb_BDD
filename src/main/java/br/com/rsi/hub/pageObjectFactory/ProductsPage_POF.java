package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsi.bdd.manager.WebDriverManager;
import br.com.rsi.hub.Utility.MassOfData;

public class ProductsPage_POF {
	WebDriver driver = WebDriverManager.driver;
	MassOfData mass;
	
	public ProductsPage_POF(WebDriver driver) {
		mass = new MassOfData();

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "15")
	private WebElement headPhoneBeats;
	
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement addCart;
	
	@FindBy(how = How.ID, using = "headphonesLink")
	private WebElement headPhones;
	
	
	@FindBy(how = How.ID, using = "checkOutPopUp")
	private WebElement btnCheckout;

	@FindBy(how = How.ID, using = "next_btn")
	private WebElement btnNext;
	
	@FindBy(how = How.NAME, using = "safepay_username")
	private WebElement safePayUserName;
	
	@FindBy(how = How.NAME, using = "safepay_password")
	private WebElement safePayPassWord;
	
	@FindBy(how = How.ID, using = "pay_now_btn_SAFEPAY")
	private WebElement btnPayNow;
	
	
	@FindBy(how = How.ID, using = "13")
	private WebElement headPhoneBose;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/section[1]/article[1]/div[2]/div[2]/h2[1]/span[1]")
	private WebElement soudOut;
	
	
	public void headPhoneBeats() {
		headPhoneBeats.click();
	}
	
	public void addCart() {
		addCart.click();
	}
	
	public void headPhones() {
		headPhones.click();
	}
	

	public void clicaBtnCheckout() {
		btnCheckout.click();
	}
	
	public void btnNext() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,300)");
		btnNext.click();
	}

	public void safePayUserName() throws Exception {
		safePayPassWord.sendKeys(mass.safePayUserName());
	}
	
	public void safePayPassWord() throws Exception {
		safePayPassWord.clear();
		safePayPassWord.sendKeys(mass.safePayPassWord());
	}
	
	public void btnPayNow() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btnPayNow);
	}
	
	public void headPhoneBose() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", headPhoneBose);
	}
	
	public String soudOut() {
		return soudOut.getText();
	}
	
}
