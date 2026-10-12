package com.gabriel.cursojava.aulainterface.atividade;

public class Quadrado extends Figura2D implements Dimensao2D {
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	// Fórmula da área do quadrado: lado * lado
	@Override
	public double calcularArea() {
		return lado * lado;
	}

}
