package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage_POF {
	WebDriver driver;

	public CartPage_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how = How.ID, using = "checkOutPopUp")
	private WebElement btnCheckOutPopUp;
	
	
	
	public void btnCheckOut() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");
		btnCheckOutPopUp.click();
	}
}
