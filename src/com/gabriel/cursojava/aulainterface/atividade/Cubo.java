package com.gabriel.cursojava.aulainterface.atividade;

public class Cubo extends Figura3D implements Dimensao3D {
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	// Área total do cubo: 6 faces quadradas (6 * l²)
	@Override
	public double calcularArea() {
		return 6 * (lado * lado);
	}

	// Volume do cubo: l³
	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}
}