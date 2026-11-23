package org.example;

public class Main
{
    static void main()
    {
        double preco = 40;
        double imposto = preco * 0.05;
        int quantidade = 2;
        double totalPrice = (preco * quantidade) + (imposto * quantidade);

        System.out.println("Alex quer comprar duas camisas");
        System.out.println("O custo total com o imposto é: $" + totalPrice);
    }
}
