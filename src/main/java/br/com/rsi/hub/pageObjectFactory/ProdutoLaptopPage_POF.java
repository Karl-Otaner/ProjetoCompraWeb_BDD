package br.com.rsi.hub.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutoLaptopPage_POF {
	
	public ProdutoLaptopPage_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "5")
	private WebElement lapTopHP11d;
	
	@FindBy(id = "bunny")
	private WebElement color;
	
	@FindBy(name = "save_to_cart")
	private WebElement cart;
	
	@FindBy(id = "checkOutPopUp")
	private WebElement popUpCheckOut;

}
