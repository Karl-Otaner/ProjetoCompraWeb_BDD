package br.com.rsi.hub.stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import br.com.rsi.bdd.manager.WebDriverManager;
import br.com.rsi.hub.Utility.Wait;
import br.com.rsi.hub.context.TestContext;
import br.com.rsi.hub.pageObjectFactory.HomePage_POF;
import br.com.rsi.hub.pageObjectFactory.ProductsPage_POF;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuyProductStep {
	WebDriver driver = WebDriverManager.driver;
	HomePage_POF home;
	ProductsPage_POF product;
	Wait wait;
	TestContext testContext;
	
	public BuyProductStep(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomePage();
		product = testContext.getPageObjectManager().getProdutoPage();
		
	}
	
	@Dado("^Usuario esta no site do Advantage Shopping$")
	public void usuarioEstaNoSiteDoAdvantageShopping() throws Throwable {
		testContext.getWebDriverManager().createDriver();
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
		home.headPhonesImg();

	}

	@Quando("^adicionar ao carrinho e fazer checkout$")
	public void adicionarAoCarrinhoEFazerCheckout() throws Throwable {
		product.headPhoneBeats();
		product.addCart();
		product.clicaBtnCheckout();

	}

	@Quando("^clicar em next$")
	public void clicar_em_next() throws Throwable {
		product.btnNext();
	}

	@Quando("^digitar um usuario e senha$")
	public void digitar_um_usuario_e_senha() throws Throwable {
		product.safePayUserName();
		product.safePayPassWord();

	}

	@Quando("^e finalizar a compra$")
	public void e_finalizar_a_compra() throws Throwable {
		Thread.sleep(3000);
		product.btnPayNow();
	}

	@Entao("^validar a compra feita$")
	public void validarACompraFeita() throws Throwable {
		assertTrue(driver.getPageSource().contains("Thank you for buying with Advantage"));
		
	}

	@Quando("^escolher um Headphone sem saldo$")
	public void escolherUmHeadphoneSemSaldo() throws Throwable {
		home.headPhonesImg();
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
