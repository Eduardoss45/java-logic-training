package br.com.eduardo.logic.repeticao;

import java.util.Scanner;

// * 1. A série de Fibonacci é formada pela sequencia: • 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... Escreva um programa que gere a série de FIBONACCI até o N-ésimo termo (com N sendo uma entrada do algoritmo).

public class Ex51Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int n = scanner.nextInt();

            int t1 = 1;
            int t2 = 0;
            int tA = 1;

            for (int i = 1; i <= n; i++) {
                if (i != n) {
                    System.out.printf("%d, ", tA);
                } else {
                    System.out.printf("%d", tA);
                }
                tA = t1 + t2;
                t2 = t1;
                t1 = tA;
            }
        }
    }
}
