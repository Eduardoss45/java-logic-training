package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 95. Escrever um algoritmo e implementá-lo em linguagem Java que linearize uma matriz de 6 por 6, colocando os valores contidos nela em um vetor de 36 elementos e mostrar o conteúdo do vetor.

public class Ex95LinearizarMatriz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[][] matriz = new int[6][6];
            int[] vetor = new int[36];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("Digite [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            int posicao = 0;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    vetor[posicao] = matriz[i][j];
                    posicao++;
                }
            }

            System.out.println("Vetor linearizado:");

            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
        }
    }
}
