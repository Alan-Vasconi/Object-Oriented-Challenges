package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Um motorista de Uber estipula o preço de uma determinada viagem dada a quantidade de quilômetros percorrida.
    Para viagens de até X km, é cobrado um valor R$ V1 por km. Acima de X km, é cobrado o valor R$ V2.
    Faça um programa que leia X, V1, V2 e a quantidade de quilômetros A da viagem e imprima o valor total
    com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada    	Saída
    100         75.00
    1.50
    1.25
    50
    Entrada    	Saída
    100         187.50
    1.50
    1.25
    150
*/
public class Ex07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantida de KM maximo que pode ser rodado: ");
        int kmmax = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o valor de V1: ");
        double valueV1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o valor de V2: ");
        double valueV2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a quantidade de KM rodado: ");
        double distance = Double.parseDouble(scanner.nextLine());

        Ex07 ex07 = new Ex07();

        double result = ex07.compute(kmmax,valueV1,valueV2,distance);
        System.out.println(result);
    }

    double compute(int x, double v1, double v2, double a) {
        double output = -0.1;

        if (a < x){
            output = a * v1;
        }else{
            output = a * v2;
        }


        return output;
    }
}
