package br.com.eduardo.logic.vetores;

import java.util.Arrays;

// * 66. Faça um programa em Java que copie o conteúdo de um vetor de 10 posições de inteiro em um segundo vetor e imprima este último.

public class Ex66CopiaVetor {
    public static void main(String[] args) {
        int[] vetorHospedeiro = new int[10];
        int[] vetorDoador = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.printf("Vetor doador: %s, vetor hospedeiro: %s%n", Arrays.toString(vetorHospedeiro),
                Arrays.toString(vetorDoador));
        for (int i = 0; i < vetorDoador.length; i++) {
            vetorHospedeiro[i] = vetorDoador[i];
            System.out.printf("Vetor hospedeiro: %s%n", Arrays.toString(vetorHospedeiro));
        }
    }
}
