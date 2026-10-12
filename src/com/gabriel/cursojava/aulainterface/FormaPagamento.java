package com.gabriel.cursojava.aulainterface;

public interface FormaPagamento {
	// Implicitamente: public abstract boolean processar(double valor);
	boolean processar(double valor);

	// Constante (implicitamente: public static final)
	String MOEDA_PADRAO = "BRL";
}
