package br.com.eduardo.logic.repeticao;

// * 50. Escreva um programa que leia um valor e imprima todas as possíveis combinações em que o lançamento de um par de dados tenha como resultado da soma dos valores dos dados o número lido. Por exemplo, se a entrada for o número 7, o programa deve imprimir as seguintes combinações: • 1 6; • 2 5; • 3 4; • 4 3; • 5 2; • 6 1;

import java.util.Scanner;

public class Ex50CombinacoesDados {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 2 a 12: ");
            int n = scanner.nextInt();

            if (n < 2 || n > 12) {
                System.out.println("Erro. O número está fora do intervalo permitido.");
                return;
            }

            for (int i = 1; i <= 6; i++) {
                int j = n - i;
                if (j >= 1 && j <= 6) {
                    System.out.printf("%d = (%d + %d);%n", n, i, j);
                }
            }
        }
    }
}
