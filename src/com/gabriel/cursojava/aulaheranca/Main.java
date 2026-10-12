package com.gabriel.cursojava.aulaheranca;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Gabriel");
		
		
		Professor professor = new Professor();
		professor.setNome("Loyane");
		
		
		System.out.println(professor.getNome());
		System.out.println(aluno.getNome());
		
		
		//Polimofismo, mas nao tenho acesso aos atributos de Aluno
		Pessoa aluno2 = new Aluno();
		aluno2.getNome();
		
		Pessoa professor2 =  new Professor();
		professor2.getNome();
	}

}
