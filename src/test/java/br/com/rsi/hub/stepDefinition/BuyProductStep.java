package br.com.rsi.hub.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.rsi.bdd.manager.PageObjectManager;
import br.com.rsi.bdd.manager.WebDriverManager;
import br.com.rsi.hub.context.TestContext;
import br.com.rsi.hub.dataProvider.ConfigFileReader;
import br.com.rsi.hub.pageObjectFactory.CartPage_POF;
import br.com.rsi.hub.pageObjectFactory.HomePage_POF;
import br.com.rsi.hub.pageObjectFactory.LoginPage_POF;
import br.com.rsi.hub.pageObjectFactory.OrdenPaymentPage;
import br.com.rsi.hub.pageObjectFactory.ProductsPage_POF;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuyProductStep {
	WebDriver driver;
	HomePage_POF home;
	LoginPage_POF login;
	ProductsPage_POF product;
	CartPage_POF cart;
	PageObjectManager objectManager;
	ConfigFileReader configFileReader;
	WebDriverManager webDriverManager;
	TestContext testContext;
	OrdenPaymentPage ordenPayment;
	
	public BuyProductStep(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomePage_POF();
		login = testContext.getPageObjectManager().getLoginPage_POF();
		product = testContext.getPageObjectManager().getProductsPage_POF();
		cart = testContext.getPageObjectManager().getCartPage_POF();
		webDriverManager = testContext.getDriverManager();
	}
	
	
	@Dado("^Usuario esta no site do Advantage Shopping$")
	public void usuarioEstaNoSiteDoAdvantageShopping() throws Throwable {
		testContext.getDriverManager().createDriver();
	}

	@Quando("^Fazer login$")
	public void fazerLogin() throws Throwable {
		home.linkLogin();
		login.userName();
		login.passWord();
		login.btnSignIn();

	}

	@Quando("^escolhe um produto pela tela principal$")
	public void escolheUmProdutoPelaTelaPrincipal() throws Throwable {
		home.lapTop();

	}

	@Quando("^adicionar ao carrinho e fazer checkout$")
	public void adicionarAoCarrinhoEFazerCheckout() throws Throwable {
		product.lapTopHP11d();
		product.color();
		product.addCart();
		home.menuCart();
		cart.btnCheckOut();

	}

	@Quando("^clicar em next digitar um usuario e senha para boleto e finalizar a compra$")
	public void clicarEmNextDigitarUmUsuarioESenhaParaBoletoEFinalizarACompra() throws Throwable {
		ordenPayment.btnNext();
		ordenPayment.safePayUserName();
		ordenPayment.safePayPassWord();
		ordenPayment.btnPayNow();
	}
	
	@Entao("^validar a compra feita$")
	public void validarACompraFeita() throws Throwable {
		
	   
	}


	@Quando("^escolher um Headphone sem saldo$")
	public void escolherUmHeadphoneSemSaldo() throws Throwable {
		driver.findElement(By.id("headphonesTxt")).click();


	}

	@Quando("^ir para tela do produto$")
	public void irParaTelaDoProduto() throws Throwable {
		driver.findElement(By.id("13")).click();


	}

	@Entao("^validar que nao ha saldo$")
	public void validarQueNaoHaSaldo() throws Throwable {
//		assert name "SOLD OUT"
		


	}


}
