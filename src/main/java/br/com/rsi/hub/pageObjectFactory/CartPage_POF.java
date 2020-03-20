package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage_POF {

	public CartPage_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how = How.ID, using = "checkOutButton")
	private WebElement btnCheckOut;
	
	
	
	public void btnCheckOut() {
		btnCheckOut.click();
	}
}
