package br.com.rsi.hub.stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.rsi.hub.Utility.Wait;
import br.com.rsi.hub.context.TestContext;
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
	Wait wait;
//	PageObjectManager objectManager;
//	ConfigFileReader configFileReader;
//	WebDriverManager webDriverManager;
	TestContext testContext;
	OrdenPaymentPage ordenPayment;
	
	public BuyProductStep(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomePage_POF();
		login = testContext.getPageObjectManager().getLoginPage_POF();
		product = testContext.getPageObjectManager().getProductsPage_POF();
		cart = testContext.getPageObjectManager().getCartPage_POF();
		wait = testContext.getPageObjectManager().getWait();
		
//		webDriverManager = testContext.getDriverManager();
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
		cart.btnCheckOut();

	}

	@Quando("^clicar em next digitar um usuario e senha para boleto e finalizar a compra$")
	public void clicarEmNextDigitarUmUsuarioESenhaParaBoletoEFinalizarACompra() throws Throwable {
		Thread.sleep(19000);
		wait.NextBnt(ordenPayment.btnNext());
		ordenPayment.btnNext();
		ordenPayment.safePayUserName();
		ordenPayment.safePayPassWord();
		ordenPayment.btnPayNow();
	}
	
	@Entao("^validar a compra feita$")
	public void validarACompraFeita() throws Throwable {
		assertTrue(ordenPayment.confirmOrderPayment().contains("Thank you for buying with Advantage"));
	   
	}


	@Quando("^escolher um Headphone sem saldo$")
	public void escolherUmHeadphoneSemSaldo() throws Throwable {
		home.headPhones();

	}

	@Quando("^ir para tela do produto$")
	public void irParaTelaDoProduto() throws Throwable {
		product.headPhoneBose();

	}

	@Entao("^validar que nao ha saldo$")
	public void validarQueNaoHaSaldo() throws Throwable {
		assertTrue(product.soudOut().contains("SOLD OUT"));

	}


}
