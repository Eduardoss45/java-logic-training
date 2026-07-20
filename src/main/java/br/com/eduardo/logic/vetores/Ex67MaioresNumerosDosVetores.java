package br.com.eduardo.logic.vetores;

import java.util.Arrays;

// * 67. Faça um programa em Java que leia dois vetores de 10 posições de inteiros e copie o maior valor dos dois em cada posição em um terceiro vetor. Em seguida, imprima este terceiro vetor.

public class Ex67MaioresNumerosDosVetores {
    public static void main(String[] args) {
        int[] vetor1 = { 19, 13, 16, 23, 9, 8, 3, 2, 18, 99 };
        int[] vetor2 = { 83, 75, 64, 31, 21, 37, 8, 2, 7, 53 };
        int[] vetor3 = new int[10];

        for (int i = 0; i < vetor3.length; i++) {
            int a1 = vetor1[i];
            int a2 = vetor2[i];

            if (a1 > a2) {
                vetor3[i] = a1;
            } else {
                vetor3[i] = a2;
            }
        }

        System.out.printf("O vetor é composto por: %s", Arrays.toString(vetor3));
    }
}
