package br.com.eduardo.logic.vetores;

import java.util.Arrays;

// * 62. Faça um programa em Java que leia um array de 10 posições e conte quantos números pares são elementos do array. Imprima esta quantidade.

public class Ex62NumerosParesNoVetor {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int pares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.printf("Há um total de %d números pares no vetor: %s", pares, Arrays.toString(vetor));
    }
}
