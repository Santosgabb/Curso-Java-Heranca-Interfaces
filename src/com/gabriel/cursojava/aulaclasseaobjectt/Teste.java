package com.gabriel.cursojava.aulaclasseaobjectt;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setCurso("Programação orientada Objetos");

		double[] notas = { 10, 8, 9, 5 };
		aluno.setNotas(notas);

		// Se tentar exibir o obj, vai exibir o endereço de memoria
		// precisa utilizar o toString na classe do objeto
		System.out.println(aluno);

		// comparação de obj
		String s1 = "abc123";
		String s2 = "abc123";
		System.out.println(s1 == s2);

		/*
		 * Nesse exemplo de cima nao estamos comparando o objeto e sim os valores que
		 * foram atribuidos
		 */

		// Compaaracao de objetos
		System.out.println(s1.equalsIgnoreCase(s2));

		Aluno aluno2 = new Aluno();
		aluno.setCurso("Orrientada Objetos");
		double[] notas2 = { 10, 8, 9, 5 };
		aluno2.setNotas(notas2);

		System.out.println(aluno == aluno2);
		
		System.out.println(aluno.equals(aluno2));
		
		// equals(): Compara o conteúdo exato (diferencia maiúsculas de minúsculas - Case-Sensitive)
		// equalsIgnoreCase(): Compara o conteúdo ignorando maiúsculas/minúsculas (Case-Insensitive)
		
	}

}
