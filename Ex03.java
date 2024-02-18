package br.edu.ifsp.ead1;

import java.util.Objects;
import java.util.Scanner;

/*
Dada uma String arbitrária, faça um programa que imprima “Sim” se essa for palíndromo e “Nao”, caso contrário.
Palíndromo é uma frase ou palavra que pode ser lida, indiferentemente, da esquerda para a direita ou vice-versa.
Por exemplo, “arara” é um palíndromo. Considere como entrada apenas palavras com letras minúsculas.
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ex03 ex = new Ex03();

        System.out.print("Digite a palavra para executar a verificação de palíndromo: ");

        String word = scanner.nextLine();

        String result = ex.compute(word);

        if (Objects.equals(result, word)){
            System.out.println("A palavra é palíndromo");
        }else{
            System.out.println(String.format("A palavra não é um palíndromo: %s != %s", word, result));

        }
    }

    String compute(String input) {

        char [] chars = input.toCharArray();
        int lenght = input.length();
        StringBuilder subString = new StringBuilder();

        for (int i = lenght-1; i >= 0; i -- ){
            subString.append(chars[i]);
        }

        return subString.toString();
    }
}
