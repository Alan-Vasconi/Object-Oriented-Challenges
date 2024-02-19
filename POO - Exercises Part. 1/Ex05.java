package br.edu.ifsp.list01;

import org.assertj.core.internal.Integers;

import java.util.Scanner;

/*
    A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h.
    Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A
    por cada km acima do limite. Faça um programa que leia o limite L, o valor da multa M,
    o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa.
    Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada	    Saída
    60          200.00
    150.00
    10.00
    65

    Entrada	    Saída
    60          0.00
    150.00
    10.00
    50
*/
public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite de velocidade: ");
        int limit = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o valor da multa: ");
        double value = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o valor adicional por km: ");
        double addvalue = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a velocidade: ");
        int speed = Integer.parseInt(scanner.nextLine());

        Ex05 ex05 = new Ex05();
        String result = ex05.compute(limit, value, addvalue,speed);

        System.out.println(result);
    }

    String compute(int L, double m, double a, int v) {
        String output =  null;

        if (v <= L){
            return "0";
        }

        int diff = v - L;
        double fine = diff * a;

        double totalfine = fine + m;

        output = String.format("%.2f",totalfine);
        return output;
    }
}
