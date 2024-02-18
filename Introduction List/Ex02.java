package br.edu.ifsp.ead1;

import java.util.*;

/*
Faça um programa que, dada uma String, encontra a primeira e a última substrings de tamanho K de acordo com a ordem
alfabética. Por exemplo, para a String “welcometojava” e K = 3; A substring “ava” é a primeira substring de tamanho
3 e “wel” é a última, considerando a ordem alfabética (saída: "ava wel"). Para dados de entrada inválidos, o programa
deverá imprimir uma String vazia.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the String: ");

        String phrase = scanner.nextLine();

        System.out.print("Type the number of 'K': ");

        int K = Integer.parseInt(scanner.nextLine());

        Ex02 ex = new Ex02();

        String result = ex.compute(phrase, K);

        System.out.println(result);
    }

    String compute(String word, int number) {

        if (number <= 0 || word == null || word.length() < number) {
            return "Ocorreu um erro na geração da resposta, confira se k é maior q zero ou se a palavra é menor que k";
        }

        SortedSet<String> output = new TreeSet<>();
        for (int i = 0; i <= word.length() - number; i++) {
            output.add(word.substring(i, i + number));
        }

        return output.first() + " " + output.last();
    }
}
