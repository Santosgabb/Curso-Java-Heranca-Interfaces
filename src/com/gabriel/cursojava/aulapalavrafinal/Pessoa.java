package com.gabriel.cursojava.aulapalavrafinal;

public class Pessoa {
	// Classe marcada como final:
	// não pode ter subclasses

	// atributo
	private String nome;
	private String endereco;

	// construtor padrao

	
	// getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
