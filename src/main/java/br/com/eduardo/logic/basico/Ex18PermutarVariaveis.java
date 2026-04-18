package br.com.eduardo.logic.basico;

// * 18. Escreva um programa que permute o valor de duas variáveis inteiras.

import java.util.Scanner;

public class Ex18PermutarVariaveis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor da variável A: ");
            int a = scanner.nextInt();
            System.out.print("Digite o valor da variável B: ");
            int b = scanner.nextInt();

            int temp = a;
            a = b;
            b = temp;

            System.out.printf("Após a permutação, o valor das variáveis são: A = %d, B = %d", a, b);
        }
    }
}
