package com.gabriel.cursojava.aulainterface;

//Implementação para PIX
public class Pix implements FormaPagamento {
	private String chavePix;

	public Pix(String chavePix) {
		this.chavePix = chavePix;
	}

	@Override
	public boolean processar(double valor) {
		System.out.println(
				"Gerando QR Code PIX (" + chavePix + ") no valor de " + FormaPagamento.MOEDA_PADRAO + " " + valor);
		return true;
	}
}