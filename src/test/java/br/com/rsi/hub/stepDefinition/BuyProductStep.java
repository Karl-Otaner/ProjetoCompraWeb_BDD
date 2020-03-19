package br.com.rsi.hub.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsi.bdd.dataProvider.ConfigFileReader;
import br.com.rsi.bdd.manager.PageObjectManager;
import br.com.rsi.bdd.manager.WebDriverManager;
import br.com.rsi.hub.pageObjectFactory.CartPage_POF;
import br.com.rsi.hub.pageObjectFactory.HomePage_POF;
import br.com.rsi.hub.pageObjectFactory.LoginPage_POF;
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
	
	
	@Dado("^Usuario esta no site do Advantage Shopping$")
	public void usuarioEstaNoSiteDoAdvantageShopping() throws Throwable {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://advantageonlineshopping.com/#/");
		

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


	}

	@Quando("^adicionar ao carrinho e fazer checkout$")
	public void adicionarAoCarrinhoEFazerCheckout() throws Throwable {
		//Produto Page
		driver.findElement(By.id("5")).click();
		driver.findElement(By.id("bunny")).click();
		driver.findElement(By.name("save_to_cart")).click();
		//add wait clickable. id "checkOutPopUp".click()
		


	}

	@Entao("^clicar em next digitar um usuario e senha para boleto e finalizar a compra$")
	public void clicarEmNextDigitarUmUsuarioESenhaParaBoletoEFinalizarACompra() throws Throwable {
		// SHIPPING DETAILSPage
		driver.findElement(By.name("countryListbox")).sendKeys("Brazil");
		driver.findElement(By.id("next_btn")).click();
		
		// PAYMENT METHODPage
		driver.findElement(By.name("safepay_username")).sendKeys("Karl123");
		driver.findElement(By.name("safepay_password")).sendKeys("Ka12");
		driver.findElement(By.id("pay_now_btn_SAFEPAY")).click();
		//page Order Payment
		//Assert ("Thank you for buying with Advantage") & print

		

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
