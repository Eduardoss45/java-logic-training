package br.com.eduardo.logic.repeticao;

// * 48. Escreva um programa que determine se um dado número N (digitado pelo usuário) é primo ou não.

import java.util.Scanner;

public class Ex48NumeroPrimo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erro. O valor digitado não pode ser menor ou igual a zero.");
                return;
            }

            int divisores = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.printf("O número %d é primo.", n);
            } else {
                System.out.printf("O número %d não é primo.", n);
            }
        }
    }
}
