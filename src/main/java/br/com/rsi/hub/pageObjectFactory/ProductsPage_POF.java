package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage_POF {
	WebDriver driver;
	
	public ProductsPage_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "5")
	private WebElement lapTopHP11d;
	
	@FindBy(how = How.ID, using = "bunny")
	private WebElement color;
	
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement addCart;
	
	@FindBy(how = How.ID, using = "headphonesLink")
	private WebElement headPhones;
	
	@FindBy(how = How.ID, using = "13")
	private WebElement headPhoneBose;
	
	@FindBy(how = How.XPATH, using = "roboto-medium ng-scope")
	private WebElement soudOut;
	
	public void lapTopHP11d() {
		lapTopHP11d.click();
	}
	
	public void color() {
		color.click();
	}
	
	public void addCart() {
		addCart.click();
	}
	
	public void headPhones() {
		headPhones.click();
	}
	
	public void headPhoneBose() {
		headPhoneBose.click();
	}
	
	public String soudOut() {
		return soudOut.getText();
	}

}
