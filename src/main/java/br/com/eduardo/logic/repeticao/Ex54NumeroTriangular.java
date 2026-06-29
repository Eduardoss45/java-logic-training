package br.com.eduardo.logic.repeticao;

// * 54. Construa um programa que receba um número e verifique se ele é um número triangular. (Um número é triangular quando é resultado do produto de três números consecutivos. Exemplo: 24 = 2 x 3 x 4)

import java.util.Scanner;

public class Ex54NumeroTriangular {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um valor: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erro. Não é possível calcular número triangular para valores inferiores ou iguais a zero.");
                return;
            }

            for (int f = 1; f < n; f++) {
                int f1 = f + 1;
                int f2 = f + 2;

                if (f * f1 * f2 == n) {
                    System.out.printf("O número %d é triangular.", n);
                    return;
                }
            }

            System.out.printf("O número %d não é triangular.", n);
        }
    }
}
