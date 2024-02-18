package br.edu.ifsp.ead1;

import java.util.Arrays;
import java.util.Scanner;

/*
Dada duas Strings A e B, faça um programa que imprima “Sim” se A e B são anagramas e “Nao”, caso contrário.
Um anagrama é a transposição de letras de palavra ou frase para formar outra palavra ou frase diferente.
Por exemplo, as palavras “roma” e “amor” são anagramas. Considere como entrada apenas palavras com letras minúsculas.
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra base: ");

        String firstWord = scanner.nextLine();

        System.out.print("Digite a palavra para verificar se é palíndromo: ");

        String finalWord = scanner.nextLine();


        Ex04 ex04 = new Ex04();

        String result = ex04.compute(firstWord, finalWord);
        System.out.println(result);
    }

    String compute(String wordA, String wordB) {
        String output = "Não";

        if (wordA.length() != wordB.length()){
            return output;
        }

        char [] charFirst = wordA.toCharArray();
        char [] charFinal = wordB.toCharArray();

        Arrays.sort(charFirst);
        Arrays.sort(charFinal);


        if (Arrays.equals(charFirst, charFinal)){
            return output = "Sim";
        }

        return output;
    }
}
