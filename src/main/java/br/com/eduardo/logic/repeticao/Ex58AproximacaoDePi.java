package br.com.eduardo.logic.repeticao;

import java.util.Scanner;

// * 58. O valor aproximado do número π pode ser calculado usando-se a série S = 1 − 1/3³ + 1/5³ - 1/7³ + 1/7³... Faça um programa que calcule e imprima o valor de π usando os N primeiros termos da série (N sendo informado durante a execução do algoritmo).

public class Ex58AproximacaoDePi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erro. Não é possível calcular com números menores ou iguais a zero.");
                return;
            }

            double soma = 0;
            for (int t = 1; t <= n; t++) {
                int i = 2 * t - 1;
                double pot = Math.pow(i, 3);
                double res = 1 / pot;
                if (t % 2 == 0) {
                    soma -= res;
                } else {
                    soma += res;
                }
            }

            double pi = Math.cbrt(32 * soma);

            System.out.printf("π ≈ %.8f%n", pi);
        }
    }
}
