package br.com.eduardo.logic.vetores;

import java.util.Arrays;
import java.util.Scanner;

// * 69. Escreva um programa que leia um vetor de 15 posições de inteiros. Em seguida, o programa deve ler um valor inteiro e imprimir o número de vezes que este valor ocorre no vetor.

public class Ex69RepeticaoDeNumeroNoVetor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetor = {
                    12, 5, 18, 7, 25,
                    3, 14, 9, 12, 1,
                    22, 5, 6, 18, 9
            };

            System.out.printf("Digite um número do vetor %s (n): ", Arrays.toString(vetor));
            int n = scanner.nextInt();

            int count = 0;
            for (int item : vetor) {
                if (item == n) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Erro. O número digitado não está inserido no vetor.");
                return;
            }

            System.out.printf("O número %d foi encontrado %d vezes.", n, count);
        }
    }
}
