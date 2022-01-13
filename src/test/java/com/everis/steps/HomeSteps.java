package com.everis.steps;

import com.everis.pages.HomePage;
import com.everis.util.Hooks;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class HomeSteps {

	@Dado("^que um usuario acessa o site \"(.*)\"$")
	public void acessarSite(String url) {
		Hooks.navigateToULRChrome(url);
	}
	
	@Quando("^pesquisa pelo produto \"(.*)\"$")
	public void pesquisarProduto(String nomeProduto) {
		HomePage homePage = new HomePage();
		homePage.pesquisarProduto(nomeProduto);
	}
	
}