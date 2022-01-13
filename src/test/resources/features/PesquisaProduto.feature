#language: pt
#encoding: utf-8

@test
Funcionalidade: Pesquisar produto

	Eu como cliente
	Quero pesquisar um produto no site da OLX
	Para encontrar o produto
		
  Cenario: Buscar produto com sucesso
  	Dado que um usuario acessa o site "https://olx.com.br"
  	Quando pesquisa pelo produto "Bike gios 4freaks"
  	Entao acessa o produto "Bike gios 4freaks"
