package org.example;

public class Main {
    static void main() {

        //imprima os valores obrigatórios:

        double ovo = 0.18; //preço do ovo

        double segunda = 100;
        double terca = 121;
        double quarta = 117;

        double media = (segunda + terca + quarta) / 3;

        double media30 = media * 30;

        System.out.println("Média dos três dias: " + media);
        System.out.println("Média mensal (30 dias): " + media30);
        System.out.println("Lucro mensal: " + (media30 * ovo));
    }
}
