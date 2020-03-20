package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsi.hub.Utility.MassOfData;

public class OrdenPaymentPage {
	WebDriver driver;
	MassOfData mass;
	
	public OrdenPaymentPage(WebDriver driver) {
		this.driver = driver;
		mass = new MassOfData();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "next_btn")
	private WebElement btnNext;
	
	@FindBy(how = How.NAME, using = "safepay_username")
	private WebElement safePayUserName;
	
	@FindBy(how = How.NAME, using = "safepay_password")
	private WebElement safePayPassWord;
	
	@FindBy(how = How.ID, using = "pay_now_btn_SAFEPAY")
	private WebElement btnPayNow;
	
	public void btnNext() {
		btnNext.click();
	}
	
	public void safePayUserName() throws Exception {
		safePayPassWord.sendKeys(mass.safePayUserName());
	}
	
	public void safePayPassWord() throws Exception {
		safePayPassWord.sendKeys(mass.safePayPassWord());
	}
	
	public WebElement btnPayNow() {
		return btnPayNow;
	}
	

}
