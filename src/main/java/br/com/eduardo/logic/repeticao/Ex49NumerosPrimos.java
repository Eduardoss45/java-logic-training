package br.com.eduardo.logic.repeticao;

// * 49. Escreva um programa que leia um número inteiro positivo N e exiba todos os números primos entre 1 e N.

import java.util.Scanner;

public class Ex49NumerosPrimos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erro. O valor digitado não pode ser menor ou igual a zero.");
                return;
            }

            for (int i = 2; i <= n; i++) {
                int divisores = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divisores++;
                    }
                }
                if (divisores == 2) {
                    System.out.printf("O número %d é primo.%n", i);
                }
            }
        }
    }
}
