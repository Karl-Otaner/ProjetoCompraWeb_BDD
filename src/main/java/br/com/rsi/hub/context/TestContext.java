package br.com.rsi.hub.context;

import br.com.rsi.bdd.manager.PageObjectManager;
import br.com.rsi.bdd.manager.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.createDriver());
	}
	
	public WebDriverManager getDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	
	
	
//	public ScenarioContext getScenarioContext() {
//		return scenarioContext;
//	}

}
