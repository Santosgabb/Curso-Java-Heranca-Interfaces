package com.gabriel.cursojava.aulainterface.atividade;

public class Piramide extends Figura3D implements Dimensao3D {
	
	// ATRIBUTOS
	private double altura;
	private double arestaBase;
	private double apotema;
	private int numPoliBase; // Quantidade de lados da base (ex: 4 para base quadrada)
	private Figura2D base; // Polimorfismo: a base pode ser qualquer Figura2D

	//GET E SET
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public int getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	//METODOS
	// Área total: área da base + soma dos triângulos laterais
	@Override
	public double calcularArea() {
		if (base != null && base instanceof Dimensao2D) {
			double areaLateral = numPoliBase * ((arestaBase * apotema) / 2);
			double areaBase = ((Dimensao2D) base).calcularArea();
			return areaLateral + areaBase;
		}
		return 0;
	}

	// Volume: (área da base * altura) / 3
	@Override
	public double calcularVolume() {
		if (base != null && base instanceof Dimensao2D) {
			return (((Dimensao2D) base).calcularArea() * altura) / 3;
		}
		return 0;
	}
}