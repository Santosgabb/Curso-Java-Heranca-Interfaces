package com.gabriel.cursojava.aulaclasseaobjectt;

public class Aluno {

	// Atributos
	private String curso;
	private double[] notas;

	// construtor padrao s/ parametro

	// Contrutor herdando os atributos da superClasse
	public Aluno() {
		super();
	}

	// get e set

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcMedia() {
		return 0;
	}

	public boolean verificaAprovado() {
		return true;
	}
	
	//metodo toString
	public String toString() {
		String s = curso + "\n";
		for (double nota : notas) {
			s +=nota + " ";
		}
		return s;
	}

}
