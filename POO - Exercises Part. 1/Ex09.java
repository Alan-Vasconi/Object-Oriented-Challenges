package br.edu.ifsp.list01;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/
public class Ex09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os valores: ");
        String values = scanner.nextLine();

        String [] valuesslice = values.split(" ");

        ArrayList<String> valuesfinal = new ArrayList<>();
        int i = 0;


        while (i < valuesslice.length && Integer.parseInt(valuesslice[i]) >= 0) {
            valuesfinal.add(valuesslice[i]);
            i++;
        }

        int[] ages = new int[valuesfinal.size()];
        for (int j = 0; j < valuesfinal.size(); j++) {
            ages[j] = Integer.parseInt(valuesfinal.get(j));
        }


        Ex09 ex09 = new Ex09();

        String result = ex09.compute(ages);
        System.out.println(result);
    }

    String compute(int[] input) {
        String output = null;

        int quantity = input.length;

        int adult = 0;
        int elderly = 0;

        for (int i = 0; i < quantity; i++) {
            if (input[i] >= 18) {
                adult++;
            }
            if (input[i] > 75) {
                elderly++;
            }
        }


        int sum = 0;
        for (int age : input) {
            sum += age;
        }

        double media = sum / quantity;
        double elderlyresult = (elderly * 100) / quantity;

        output = String.format("%.2f %d %.2f%%", media, adult, elderlyresult);

        return output;
    }
}
