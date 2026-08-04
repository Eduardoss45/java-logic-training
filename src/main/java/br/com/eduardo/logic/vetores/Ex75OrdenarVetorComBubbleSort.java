package br.com.eduardo.logic.vetores;

import java.util.Arrays;

// * 75. Escreva um programa que ordene um array de inteiros de 15 posições utilizando o método da bolha (bubble sort).

public class Ex75OrdenarVetorComBubbleSort {
    public static void main(String[] args) {
        int[] vetor = { 2, 7, 3, 15, 11, 6, 4, 1, 13, 5, 10, 8, 12, 9, 14 };
        int temp = vetor[0];
        boolean swapped = false;

        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        
        System.out.println(Arrays.toString(vetor));
    }
}
