package br.com.eduardo.logic.vetores;

import java.util.Arrays;

// * 63. Escreva um programa que leia dois vetores de números reais de mesma dimensão (10 posições), e imprima o vetor resultante da soma destes vetores.

public class Ex63SomaDeVetores {
    public static void main(String[] args) {
        int[] vetor1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] vetor2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] vetorRes = new int[10];

        for (int i = 0; i < vetorRes.length; i++) {
            vetorRes[i] = vetor1[i] + vetor2[i];
        }

        System.out.printf("O vetor resultante é: %s", Arrays.toString(vetorRes));
    }
}
