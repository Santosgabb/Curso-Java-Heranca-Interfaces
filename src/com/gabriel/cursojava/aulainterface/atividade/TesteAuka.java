package com.gabriel.cursojava.aulainterface.atividade;

public class TesteAuka {

	public static void main(String[] args) {

		// Instanciando figuras 2D
		Quadrado f1 = new Quadrado();
		f1.setNome("Quadrado");
		f1.setCor("Azul");
		f1.setLado(4);

		Circulo f2 = new Circulo();
		f2.setNome("Círculo");
		f2.setCor("Vermelho");
		f2.setRaio(3.5);

		Triangulo f3 = new Triangulo();
		f3.setNome("Triângulo");
		f3.setCor("Verde");
		f3.setBase(5.0);
		f3.setAltura(8.0);

		// Instanciando figuras 3D
		Cubo f4 = new Cubo();
		f4.setNome("Cubo");
		f4.setCor("Amarelo");
		f4.setLado(3);

		Cilindro f5 = new Cilindro();
		f5.setNome("Cilindro");
		f5.setCor("Roxo");
		f5.setRaio(2.0);
		f5.setAltura(6.0);

		Piramide f6 = new Piramide();
		f6.setNome("Pirâmide");
		f6.setCor("Laranja");
		f6.setAltura(9.0);
		f6.setArestaBase(4.0);
		f6.setApotema(5.0);
		f6.setBase(f1); // Usando a figura 2D (Quadrado) como base

		// Array polimórfico com a classe base FiguraGeometrica
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		figuras[5] = f6;

		// Iterando sobre o array e exibindo os dados
		for (FiguraGeometrica figura : figuras) {
			System.out.println("--------------------------------");
			System.out.println("Nome: " + figura.getNome());
			System.out.println("Cor: " + figura.getCor());

			// Verificação do tipo para exibir os atributos específicos
			if (figura instanceof Quadrado) {
				Quadrado q = (Quadrado) figura;
				System.out.println("Lado: " + q.getLado());
			} else if (figura instanceof Circulo) {
				Circulo c = (Circulo) figura;
				System.out.println("Raio: " + c.getRaio());
			} else if (figura instanceof Triangulo) {
				Triangulo t = (Triangulo) figura;
				System.out.println("Base: " + t.getBase());
				System.out.println("Altura: " + t.getAltura());
			} else if (figura instanceof Cubo) {
				Cubo cb = (Cubo) figura;
				System.out.println("Lado/Aresta: " + cb.getLado());
			} else if (figura instanceof Cilindro) {
				Cilindro cl = (Cilindro) figura;
				System.out.println("Raio: " + cl.getRaio());
				System.out.println("Altura: " + cl.getAltura());
			} else if (figura instanceof Piramide) {
				Piramide p = (Piramide) figura;
				System.out.println("Altura: " + p.getAltura());
				System.out.println("Aresta da Base: " + p.getArestaBase());
				System.out.println("Apótema: " + p.getApotema());
				if (p.getBase() != null) {
					System.out.println("Base: " + p.getBase().getNome());
				}
			}
		}
	}

}
