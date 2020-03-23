package br.com.rsi.bdd.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub.Utility.Wait;
import br.com.rsi.hub.pageObjectFactory.HomePage_POF;
import br.com.rsi.hub.pageObjectFactory.ProductsPage_POF;

public class PageObjectManager {
	private WebDriver driver;
	private HomePage_POF homePage;
	private ProductsPage_POF produtopage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage_POF getHomePage() {
		return (homePage == null) ? homePage = new HomePage_POF(driver) : homePage;
	}

	public ProductsPage_POF getProdutoPage() {
		return (produtopage == null) ? produtopage = new ProductsPage_POF(driver) : produtopage;

	}
	
}
