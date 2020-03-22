package br.com.rsi.bdd.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub.Utility.Wait;
import br.com.rsi.hub.pageObjectFactory.CartPage_POF;
import br.com.rsi.hub.pageObjectFactory.HomePage_POF;
import br.com.rsi.hub.pageObjectFactory.LoginPage_POF;
import br.com.rsi.hub.pageObjectFactory.OrdenPaymentPage;
import br.com.rsi.hub.pageObjectFactory.ProductsPage_POF;

public class PageObjectManager {
	private WebDriver driver;
	private HomePage_POF homePage;
	private LoginPage_POF loginPage;
	private ProductsPage_POF productsPage;
	private CartPage_POF cartPage;
	private OrdenPaymentPage ordenPayment;
	private Wait wait;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage_POF getHomePage_POF() {
		return (homePage == null) ? homePage = new HomePage_POF(driver) : homePage;
	}
	
	public LoginPage_POF getLoginPage_POF() {
		return (loginPage == null) ? loginPage = new LoginPage_POF(driver) : loginPage;
	}
	
	public ProductsPage_POF getProductsPage_POF() {
		return (productsPage == null) ? productsPage = new ProductsPage_POF(driver) : productsPage;
	}
	
	public CartPage_POF getCartPage_POF() {
		return (cartPage == null) ? cartPage = new CartPage_POF(driver) : cartPage;
	}

	public Wait getWait() {
		return (wait == null) ? wait = new Wait(driver) : wait;
		
	}
	
}
