package com.gabriel.cursojava.aulacastingeof;
public class Teste2 {

    public static String obterString() {
        return "minha String";
    }

    public static int obterInteiro() {
        return 1;
    }

    public static void main(String[] args) {

        // Cenário 1: Funciona em execução
        // O método retorna String, guardada em Object (Upcasting), e convertida de volta (Downcasting)
        Object obj1 = obterString(); // [00:08:21]
        String s1 = (String) obj1;   // [00:08:49]
        System.out.println("s1: " + s1);

        // Cenário 2: Funciona em execução
        // A referência em memória guarda explicitamente uma String
        Object obj2 = "Minha String"; // Upcasting [00:09:13]
        String s2 = (String) obj2;    // Downcasting [00:09:32]
        System.out.println("s2: " + s2);

        // Cenário 3: ERRO em execução (ClassCastException)
        // O objeto na memória é um java.lang.Object puro, não possui os dados de uma String [00:10:16]
        Object obj3 = new Object();
        /*
        String s3 = (String) obj3; // Lança ClassCastException [00:10:51]
        */

        // Cenário 4: ERRO em execução (ClassCastException)
        // O tipo armazenado é um Integer/int, incompatível com String [00:11:16]
        Object obj4 = obterInteiro();
        /*
        String s4 = (String) obj4; // Lança ClassCastException [00:11:37]
        */
    }
}
