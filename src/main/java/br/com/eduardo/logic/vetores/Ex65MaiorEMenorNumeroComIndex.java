package br.com.eduardo.logic.vetores;

import java.util.Arrays;

// * 65. Faça um programa em Java que leia um array de 20 inteiros e imprima o menor e o maior valor dentre os elementos do array, bem como suas respectivas posições.

public class Ex65MaiorEMenorNumeroComIndex {
    public static void main(String[] args) {
        int[] array = { 20, 6, 15, 5, 10, 14, 16, 19, 7, 13, 18, 11, 2, 12, 3, 17, 8, 9, 1, 4 };

        int ma = array[0];
        int me = array[0];

        int indexMa = 0;
        int indexMe = 0;

        for (int i = 0; i < array.length; i++) {
            int n = array[i];

            if (n > ma) {
                ma = n;
                indexMa = i;
            } else if (n < me) {
                me = n;
                indexMe = i;
            }
        }

        System.out.printf("O array %s tem como menor número %d na posição %d e o maior %d na posição %d.",
                Arrays.toString(array), me, indexMe, ma,
                indexMa);
    }
}
