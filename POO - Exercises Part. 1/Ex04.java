package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.

    Entrada	Saída
    10      6
    2
    5
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de dinheiro levado: ");
        int value = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o valor do chocolate: ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o total de embalagens para a troca: ");
        int packs = Integer.parseInt(scanner.nextLine());


        Ex04 ex04 = new Ex04();

        int result = ex04.compute(value,price,packs);
        System.out.println(result);
    }

    int compute(int n, int c, int m) {
        int output =  -1;
        int more = 0;

        if (n < 0 && n < c || c <= 0){
            return 0;
        }

        int quantity = n / c;
        int quantityadd = quantity;

        while (quantityadd >= m) { // Adicionei um loop pois ele pode continuar trocando de acordo com mais embalagens que ele ganha de brinde.
            int extra = quantityadd / m;
            quantityadd = extra % m + extra;
            quantity += extra;

        }
        output = quantity;

        return output;
    }
}
