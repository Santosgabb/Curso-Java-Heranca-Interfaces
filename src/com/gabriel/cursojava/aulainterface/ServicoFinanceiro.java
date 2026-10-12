package com.gabriel.cursojava.aulainterface;

public abstract class ServicoFinanceiro {
	private String titular;

	public ServicoFinanceiro(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}
}
