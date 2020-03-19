package br.com.rsi.hub.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ComprarProduto {
	public WebDriver driver;
	
	@Dado("^Usuario esta no site do Advantage Shopping$")
	public void usuarioEstaNoSiteDoAdvantageShopping() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
		Thread.sleep(5000);
		

	}

	@Quando("^Fazer login$")
	public void fazerLogin() throws Throwable {
		
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.name("username")).sendKeys("Karl_Otaner");
		driver.findElement(By.name("password")).sendKeys("Aa123456");
		driver.findElement(By.id("sign_in_btnundefined")).click();


	}

	@Quando("^escolhe um produto pela tela principal$")
	public void escolheUmProdutoPelaTelaPrincipal() throws Throwable {
		//HomePage
		driver.findElement(By.id("laptopsImg")).click();


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
