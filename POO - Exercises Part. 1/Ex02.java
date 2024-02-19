package br.edu.ifsp.list01;

/*
    Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que verifica se o triângulo é:

    Escaleno (todos os lados diferentes)
    Isósceles (possui dois lados iguais)
    Equilátero (todos os lados iguais)
    Não forma triângulo (a soma de dois lados deve ser maior que o terceiro lado)
    Os três números devem ser inteiros positivos e lidos na mesma linha (Ex: 3 4 5) Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 3 2 | Saída = Isosceles
    Exemplo 2: Entrada = 2 2 2 | Saída = Equilatero
    Exemplo 3: Entrada = 1 2 4 | Saída = Nao forma triangulo
    Exemplo 4: Entrada = -1 2 4 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os valores separados por espaço: ");
        String numbers = scanner.nextLine();

        if (!numbers.contains(" ")){
            System.out.println("Valor de entrada inválido, digite com espaços!");
        }else {
            Ex02 ex02 = new Ex02();

            String[] numbersArray = numbers.split(" ");

            int number1 = Integer.parseInt(numbersArray[0]);
            int number2 = Integer.parseInt(numbersArray[1]);
            int number3 = Integer.parseInt(numbersArray[2]);

            String result = ex02.compute(number1, number2, number3);

            System.out.println(result);
        }
    }

    String compute(int a, int b, int c) {
        String output = "Escaleno";

        if (a < 0 || b < 0 || c < 0){
            return "Erro";
        }

        if (a + b <= c || b + c <= a || c + a <= b){
            return "Não forma triângulo";
        }

        if (a == b && b == c) {
            output = "Equilátero";

        }else if(a != b && a == c || b != a && b == c) {
            output = "Isósceles";
        }

        return output;
    }
}
