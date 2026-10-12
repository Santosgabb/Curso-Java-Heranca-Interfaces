package com.gabriel.cursojava.aulainterface.atividade;

public class Circulo extends Figura2D implements Dimensao2D {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	// Fórmula da área do círculo: pi * r²
	@Override
	public double calcularArea() {
		return Math.PI * (raio * raio);
	}
}
