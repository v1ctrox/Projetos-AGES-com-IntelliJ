package org.example;

public class Main
{
    static void main()
    {

        //Primeiro cenário
        //totalEggs coletados entre segunda-feira e quarta-feira:
        int chickenCount = 3;
        int eggsPerChicken = 5;

        int segunda = chickenCount * eggsPerChicken; // 3 * 5 = 15
        int terca = (++chickenCount) * eggsPerChicken; // (1 + 3) = 4 * 5 = 20
        int quarta = (chickenCount / 2) * eggsPerChicken; // (4 / 2) = 2 * 5 = 10

        System.out.println("Primeiro cenário: " + (segunda + terca + quarta)); // 15 + 20 + 10 = 45

        segundoCenario();
    }

    static void segundoCenario()
    {
        //Segundo cenário
        //totalEggs coletados entre segunda-feira e quarta-feira:
        int chickenCount = 8;
        int eggsPerChicken = 4;

        int segunda = chickenCount * eggsPerChicken; // 8 * 4 = 32
        int terca = (++chickenCount) * eggsPerChicken; // (1 + 8) = 9 * 4 = 36
        int quarta = (chickenCount / 2) * eggsPerChicken; // (9 / 2) = 4 (divisão inteiro) * 4 = 18

        System.out.println("Segundo cenário: " + (segunda + terca + quarta)); // 32 + 36 + 18 = 84
    }
}