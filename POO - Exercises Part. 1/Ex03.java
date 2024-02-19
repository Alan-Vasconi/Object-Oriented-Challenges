package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Escrever um programa que, dado um ano válido qualquer, verifica se ele é bissexto ou não:

    São bissextos todos os anos múltiplos de 400, p. ex: 1600, 2000, 2400, 2800...
    São bissextos todos os múltiplos de 4 e não múltiplos de 100, p.ex: 1996, 2004, 2008, 2012, 2016…
    Não são bissextos os demais anos.
    Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 1600 | Saída = Ano bissexto
    Exemplo 2: Entrada = 1997 | Saída = Ano nao bissexto
    Exemplo 3: Entrada = 2000 | Saída = Ano bissexto
    Exemplo 4: Entrada = 2016 | Saída = Ano bissexto
    Exemplo 5: Entrada = 0 | Saída = Erro
*/
public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano para confirmar se é bissexto ou não: ");
        int Year = Integer.parseInt(scanner.nextLine());

        Ex03 ex03 = new Ex03();

        String result = ex03.compute(Year);
        System.out.println(result);
    }


    String compute(int input) {
        String output = "Ano não bissexto";

        if (input <= 0){
            return "Erro";
        }

        if (input % 400 == 0){
            return "Ano bissexto";
        }

        if (input % 4 == 0 && input % 100 != 0){
            return "Ano Bissexto";
        }

        return output;
    }
}
