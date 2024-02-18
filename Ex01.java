package br.edu.ifsp.ead1;

import java.util.Scanner;

/*
Implemente um programa que gere senhas provisórias a partir do nome do usuário, seguindo o mesmo
padrão dos exemplos a seguir:

EXEMPLO 1 Entrada: Java | Saída: J*Ja*Jav*Jav*Ja* J
EXEMPLO 2 Entrada: POOS3 | Saída: P*PO*POO*POOS*POOS*POO*PO*P
EXEMPLO 3 Entrada: KO | Saída: K*K
EXEMPLO 4 Entrada: O | Saída: Invalido
EXEMPLO 5 Entrada: | Saída: Invalido
*/

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the user's name: ");

        String name = scanner.nextLine();

        Ex01 ex = new Ex01();

        String result = ex.compute(name);
        if (result == null || result.isEmpty()){
            System.out.println("Invalid name");
        }else{
            System.out.println("Password generated successfully!");
            System.out.println("Your password is: " + result);
        }
    }

    String compute(String input) {
        String output = null;

        if (input == null || input.isEmpty()) {
            return "Invalido";
        }

        int len = input.length();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < len - 1; i++) {
            password.append(input, 0, i + 1);

            if (i < len - 1) {
                password.append('*');
            }
        }

        for (int j = len; j > 0; j--) {
            password.append(input, 0, j -1);


            if (j > 2) {
                password.append('*');
            }
        }

        output = password.toString();
        return output;
    }

}
