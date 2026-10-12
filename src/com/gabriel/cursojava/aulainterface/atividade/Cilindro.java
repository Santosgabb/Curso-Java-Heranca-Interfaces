package com.gabriel.cursojava.aulainterface.atividade;

public class Cilindro extends Figura3D implements Dimensao3D {
	private double raio;
	private double altura;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Área total: 2 bases circulares (2 * pi * r²) + área lateral (2 * pi * r * h)
	@Override
	public double calcularArea() {
		double areaBase = Math.PI * (raio * raio);
		double areaLateral = 2 * Math.PI * raio * altura;
		return (2 * areaBase) + areaLateral;
	}

	// Volume: área da base * altura
	@Override
	public double calcularVolume() {
		return Math.PI * (raio * raio) * altura;
	}
}