package com.gabriel.cursojava.aulainterface.atividade;
public class Teste {

    public static void main(String[] args) {

        // 1. Criação das figuras 2D
        Quadrado f1 = new Quadrado();
        f1.setLado(2);
        f1.setNome("Quadrado");

        Circulo f2 = new Circulo();
        f2.setRaio(2);
        f2.setNome("Círculo");

        Triangulo f3 = new Triangulo();
        f3.setAltura(2);
        f3.setBase(3);
        f3.setNome("Triângulo");

        // 2. Criação das figuras 3D
        Cubo f4 = new Cubo();
        f4.setLado(3);
        f4.setNome("Cubo");

        Cilindro f5 = new Cilindro();
        f5.setAltura(3);
        f5.setRaio(2);
        f5.setNome("Cilindro");

        Piramide f6 = new Piramide();
        f6.setAltura(3);
        f6.setApotema(4);
        f6.setArestaBase(2);
        f6.setNumPoliBase(4);
        f6.setBase(f1); // Vincula o Quadrado (Figura2D) como base da pirâmide
        f6.setNome("Pirâmide");

        // 3. Array polimórfico agrupando todas as figuras
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;
        figuras[5] = f6;

        // 4. Varredura e execução polimórfica com verificação de tipo
        for (FiguraGeometrica figura : figuras) {
            System.out.println("--------------------------------");
            System.out.println("Nome: " + figura.getNome());

            // Se implementar Dimensao2D, executa cálculo de área
            if (figura instanceof Dimensao2D) {
                Dimensao2D f2d = (Dimensao2D) figura;
                System.out.println("Área: " + f2d.calcularArea());
            }

            // Se implementar Dimensao3D, executa cálculo de área e volume
            if (figura instanceof Dimensao3D) {
                Dimensao3D f3d = (Dimensao3D) figura;
                System.out.println("Área: " + f3d.calcularArea());
                System.out.println("Volume: " + f3d.calcularVolume());
            }
        }
    }
}