package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/
public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double Width = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a altura: ");
        double Height = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o valor da lata de tinta: ");
        double cost = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o rendimento: ");
        double Yield = Double.parseDouble(scanner.nextLine());

        Ex06 ex06 = new Ex06();

        String result = ex06.compute(Width,Height,cost, Yield);
        System.out.println(result);
    }

    String compute(double L, double a, double c, double m) {
        String output = null;

        double total = L * a;

        int cans = (int) Math.ceil(total / m);

        double totalcost = cans * c;

        output = String.format("%d %.2f", cans, totalcost);
        return output;
    }
}
