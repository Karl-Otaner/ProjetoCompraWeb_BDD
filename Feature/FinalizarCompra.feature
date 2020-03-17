# language: pt
#	coding: utf-8

Funcionalidade: Finalizar a compra de um produto no site Advantage Shopping

	Contexto:
		Dado Usuario esta no site do Advantage Shopping
		Quando Fazer login

	@Sucesso
	Cenario: Buscar produtod validos na tela principal
		E escolhe um produto pela tela principal
		E adicionar ao carrinho e fazer checkout
		Entao clicar em next digitar um usuario e senha para boleto e finalizar a compra
		
	@Falha
	Cenario: Buscar produto sem quantidade 
		Quando escolher um Headphone sem saldo
		E ir para tela do produto
		Entao validar que nao ha saldo
	