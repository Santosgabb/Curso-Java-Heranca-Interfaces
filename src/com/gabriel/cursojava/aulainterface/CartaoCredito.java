package com.gabriel.cursojava.aulainterface;

//Implementação para Cartão de Crédito
public class CartaoCredito implements FormaPagamento {
	private String numeroCartao;

	public CartaoCredito(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	@Override
	public boolean processar(double valor) {
		System.out.println("Validando limite e cobrando " + FormaPagamento.MOEDA_PADRAO + " " + valor + " no cartão "
				+ numeroCartao);
		return true;
	}
}