package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Você está na Austrália treinando cangurus para se locomoverem em linha reta. Você quer saber se dois cangurus
    estarão na mesma posição em um determinado tempo, dado a posição inicial de cada canguru e qual a distância que
    eles saltam. Como você sabe programar muito bem, você decidiu fazer um programa para isso. Seu programa deve ler:
     - A posição inicial X1 e a distância do pulo V1 do primeiro canguru.
     - A posição inicial X2 e a distância do pulo V2 do segundo canguru.

    Após isso, seu programa deve imprimir SIM se os dois cangurus se encontrarão no mesmo ponto e NAO caso eles
    nunca se encontrem.

    Por exemplo, o primeiro canguru começa em X1 = 2 e tem uma distância do pulo de V1 = 1. O segundo canguru começa
    em X2 = 1 e tem uma distância de pulo de V2 = 2. Após um pulo ambos estarão no ponto *3*, portanto a respota é SIM.

    ### Exemplos de entrada e saída:

    | Entrada    | Saída  |
    | -------    | ------ |
    | 0  3  4  2 | SIM    |
    | 0  2  5  3 | NAO    |

    Fonte: Adaptado de https://www.hackerrank.com/challenges/kangaroo/problem

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
*/
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os valores: ");
        String values = scanner.nextLine();

        String [] valuesslice = values.split(" ");

        int kangaroo1 = Integer.parseInt(valuesslice[0]);
        int speed1 = Integer.parseInt(valuesslice[1]);
        int kangaroo2 = Integer.parseInt(valuesslice[2]);
        int speed2 = Integer.parseInt(valuesslice[3]);

        Ex10 ex10 = new Ex10();
        String result = ex10.compute(kangaroo1,speed1,kangaroo2,speed2);
        System.out.println(result);
    }

    String compute(int x1, int v1, int x2, int v2) {
        String output = null;

        if (v1 == v2){
            output = "NAO";
            return output;
        }

        int distance = x2 - x1;
        int speedDiff = v1 - v2;

        if (distance / speedDiff >= 0 && distance % speedDiff == 0){
            output = "SIM";
            return output;
        }
        output = "NAO";

        return output;
    }
}
