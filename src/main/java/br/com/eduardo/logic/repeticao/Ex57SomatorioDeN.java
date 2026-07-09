package br.com.eduardo.logic.repeticao;

import java.util.Scanner;

// * 57. Sendo S = 1 + 1/2² + 1/3³ + 1/n^n... um somatório de N (informado pelo usuário) termos, escreva um programa para calcular S para um número N.

public class Ex57SomatorioDeN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erro. Não é possível calcular o somatório com números menores ou iguais a zero.");
                return;
            }

            double soma = 0;
            for (int i = 1; i <= n; i++) {
                double pot = Math.pow(i, i);
                double res = 1 / pot;
                soma += res;
            }

            System.out.printf("O resultado da somatória de %d é %.8f.", n, soma);
        }
    }
}
