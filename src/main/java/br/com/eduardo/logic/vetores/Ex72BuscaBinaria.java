package br.com.eduardo.logic.vetores;

import java.util.Arrays;
import java.util.Scanner;

// * 72. Escreva um programa que leia um vetor de 10 posições ordenados de inteiros e um inteiro. O programa deve informar a primeira posição onde este inteiro ocorre no vetor ou -1 caso o valor não ocorra no vetor (Busca Binária).

public class Ex72BuscaBinaria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetor = { 3, 8, 10, 12, 17, 25, 31, 40, 55, 60 };

            System.out.print("Digite o valor de busca: ");
            int n = scanner.nextInt();

            int left = 0;
            int right = vetor.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (vetor[mid] == n) {
                    System.out.printf("O item foi encontrado no indice %d do vetor %s", mid, Arrays.toString(vetor));
                    return;
                } else if (n > vetor[mid]) {
                    left = mid + 1;
                } else if (n < vetor[mid]) {
                    right = mid - 1;
                }
            }

            System.out.printf("O item não foi encontrado no vetor %s -1", Arrays.toString(vetor));
            return;
        }
    }
}
