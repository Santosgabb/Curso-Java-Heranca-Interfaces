package com.gabriel.cursojava.aulacastingeof;

public class Teste {

	public static void main(String[] args) {

		// ==========================================
		// 1. UPCASTING (Subclasse -> Superclasse)
		// ==========================================
		// Ocorre de forma implícita e automática, pois todo Aluno É UMA Pessoa.
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; // Upcasting automático [00:03:23]

		// Também pode ser feito explicitamente (manual):
		Pessoa pessoaAluno2 = (Pessoa) new Aluno(); // [00:04:26]

		// ==========================================
		// 2. DOWNCASTING (Superclasse -> Subclasse)
		// ==========================================
		// Tentar forçar uma Pessoa genérica a virar Aluno compila,
		// mas lança ClassCastException em tempo de execução:
		Pessoa pessoa = new Pessoa();

		/*
		 * O código abaixo compila com cast manual, mas FALHA em execução: Aluno
		 * alunoFalha = (Aluno) pessoa; // ClassCastException [00:06:51]
		 */

		// ==========================================
		// 3. USO DO OPERADOR instanceof
		// ==========================================
		// Serve para checar o tipo real do objeto na memória antes de arriscar um cast
		// [00:12:37]
		Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		Professor prof1 = new Professor();

		if (p1 instanceof Pessoa) { // [00:13:18]
			System.out.println("p1 é do tipo Pessoa");
		}

		if (a1 instanceof Aluno) { // [00:13:43]
			System.out.println("a1 é do tipo Aluno");
		}

		if (a1 instanceof Pessoa) {
			// Retorna true porque Aluno herda de Pessoa
			System.out.println("a1 também é uma instância de Pessoa (herança)!");
		}

		if (prof1 instanceof Professor) { // [00:13:58]
			System.out.println("prof1 é do tipo Professor");
		}

		// Forma segura de fazer Downcasting:
		Pessoa pGenerica = new Aluno(); // Objeto real na memória é Aluno
		if (pGenerica instanceof Aluno) {
			Aluno alunoSeguro = (Aluno) pGenerica; // Downcasting 100% seguro
			System.out.println("Downcasting executado com sucesso!");
		}
	}
}