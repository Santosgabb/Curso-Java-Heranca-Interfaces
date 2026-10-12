package com.gabriel.cursojava.aulaclasseabstrata;

public class Aluno extends Pessoa {

	// Atributos
	private String curso;
	private double[] notas;

	// construtor padrao s/ parametro

	// Contrutor herdando os atributos da superClasse
	public Aluno() {
		super();
	}

	// construtor cm os atributos da superclasse
	// podemos colocar os atributos desta classe nesse construtor
	public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular,String curso) {
		super(nome, endereco, telefone, cpf, telefoneCelular);
		this.curso = curso;
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
	
	public void metodoQualqur() {
		super.setCpf("Testr");
		this.setCpf("124");
	}

	@Override
	public String metodoAbstrato() {
		// Herdando o metodo da superclasse
		return null;
	}
}
