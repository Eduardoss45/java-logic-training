package br.com.eduardo.logic.vetores;

import java.util.Arrays;
import java.util.Scanner;

// * 71. Escreva um programa que leia um vetor de 10 posições de inteiros e um inteiro. O programa deve informar a primeira posição onde este inteiro ocorre no vetor ou -1 caso o valor não ocorra no vetor (Busca Sequencial).

public class Ex71BuscaSequencial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetor = { 1, 3, 7, 31, 82, 25, 30, 49, 8, 10 };

            System.out.print("Digite um número para buscar: ");
            int n = scanner.nextInt();
            int p = -1;
            for (int i = 0; i < vetor.length; i++) {
                if (n == vetor[i]) {
                    p = i;
                    break;
                }
            }
            
            if (p == -1) {
                System.out.println("Valor não encontrado.");
            } else {
                System.out.printf("Número encontrado na posição %d do vetor %s.",
                        p, Arrays.toString(vetor));
            }
        }
    }
}
