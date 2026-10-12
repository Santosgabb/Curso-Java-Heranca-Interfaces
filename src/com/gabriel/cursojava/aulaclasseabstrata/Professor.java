package com.gabriel.cursojava.aulaclasseabstrata;

public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	// metodos
	public double calcSalarioLiquido() {
		return 0;
	}

	@Override
	public String metodoAbstrato() {
		// metodo sobreescrito da superclasse
		return null;
	}
}
