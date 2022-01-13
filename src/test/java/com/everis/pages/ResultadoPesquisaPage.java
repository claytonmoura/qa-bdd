package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class ResultadoPesquisaPage extends BasePage {	
	
	public ResultadoPesquisaPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}	

	public void acessarProduto(String nomeProduto) {		
		WebElement tituloProduto = driver.findElement(By.xpath("//*[@title='" + nomeProduto + "']"));
		tituloProduto.click();
		log("Acessou o produto: " + nomeProduto);
	}

}