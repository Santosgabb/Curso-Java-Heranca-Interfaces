package com.gabriel.cursojava.aulainterface;

public class BoletoBancario extends ServicoFinanceiro implements FormaPagamento, Notificavel {

	public BoletoBancario(String titular) {
		super(titular);
	}

	@Override
	public boolean processar(double valor) {
		System.out.println("Gerando linha digitável de boleto para " + getTitular() + " no valor de " + valor);
		return true;
	}

	@Override
	public void enviarComprovante(String email) {
		System.out.println("Boleto enviado para o e-mail: " + email);
	}

}
