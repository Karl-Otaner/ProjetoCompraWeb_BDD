package br.com.rsi.hub.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsi.bdd.manager.WebDriverManager;

public class Wait {
	WebDriver driver = WebDriverManager.driver;
	private static WebDriverWait wait;
	private JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	public Wait(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}
	
	public void WaitUntil(WebElement element){
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void NextBnt(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}

}
