package br.com.rsi.hub.stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub.Utility.Wait;
import br.com.rsi.hub.context.TestContext;
import br.com.rsi.hub.pageObjectFactory.HomePage_POF;
import br.com.rsi.hub.pageObjectFactory.ProductsPage_POF;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuyProductStep {
	WebDriver driver;
	HomePage_POF home;
	ProductsPage_POF product;
	Wait wait;
	TestContext testContext;
	
	public BuyProductStep(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomePage_POF();
		product = testContext.getPageObjectManager().getProductsPage_POF();
		wait = testContext.getPageObjectManager().getWait();
		
	}
	
	
	@Dado("^Usuario esta no site do Advantage Shopping$")
	public void usuarioEstaNoSiteDoAdvantageShopping() throws Throwable {
		testContext.getDriverManager().createDriver();
	}

	@Quando("^Fazer login$")
	public void fazerLogin() throws Throwable {
		home.linkLogin();
		home.userName();
		home.passWord();
		home.btnSignIn();

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
		product.clicaBtnCheckout();

	}

	@Quando("^clicar em next digitar um usuario e senha para boleto e finalizar a compra$")
	public void clicarEmNextDigitarUmUsuarioESenhaParaBoletoEFinalizarACompra() throws Throwable {
//		Thread.sleep(19000);
		product.btnNext();

		product.safePayUserName();
		product.safePayPassWord();
		product.btnPayNow();
	}
	
	@Entao("^validar a compra feita$")
	public void validarACompraFeita() throws Throwable {
		assertTrue(product.confirmOrderPayment().contains("Thank you for buying with Advantage"));
	   
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
