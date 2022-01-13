package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class HomePage extends BasePage {

	@FindBy(css = "#searchtext")
	protected WebElement campoBusca;
	
	@FindBy(css = ".searchSubmitBtn")
	protected WebElement botaoLupaBuscar;
	
	public HomePage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void pesquisarProduto(String nomeProduto) {
		campoBusca.sendKeys(nomeProduto);
		botaoLupaBuscar.click();
		log("Pesquisou pelo produto: " + nomeProduto);
	}

}