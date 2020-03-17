package br.com.rsi.hub.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ComprarProduto {
	public static WebDriver driver;
	
	@Dado("^Usuario esta no site do Advantage Shopping$")
	public void usuario_esta_no_site_do_Advantage_Shopping() throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com/#/");

	}

	@Quando("^Fazer login$")
	public void fazer_login() throws Throwable {
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.name("username")).sendKeys("Karl_Otaner");
		driver.findElement(By.name("password")).sendKeys("Aa123456");
		driver.findElement(By.id("sign_in_btnundefined")).click();


	}

	@Quando("^escolhe um produto pela tela principal$")
	public void escolhe_um_produto_pela_tela_principal() throws Throwable {
		driver.findElement(By.id("laptopsImg")).click();


	}

	@Quando("^adicionar ao carrinho e fazer checkout$")
	public void adicionar_ao_carrinho_e_fazer_checkout() throws Throwable {


	}

	@Entao("^clicar em next digitar um usuario e senha para boleto e finalizar a compra$")
	public void clicar_em_next_digitar_um_usuario_e_senha_para_boleto_e_finalizar_a_compra() throws Throwable {


	}

	@Quando("^escolher um Headphone sem saldo$")
	public void escolher_um_Headphone_sem_saldo() throws Throwable {


	}

	@Quando("^ir para tela do produto$")
	public void ir_para_tela_do_produto() throws Throwable {


	}

	@Entao("^validar que nao ha saldo$")
	public void validar_que_nao_ha_saldo() throws Throwable {


	}


}
