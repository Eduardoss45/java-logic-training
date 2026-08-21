package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 91. Elabore um programa em Java que leia valores inteiros para preencher uma matriz A 5 x 5. Você deverá criar adicionalmente dois vetores de 5 elementos: somaLinhas e somaColunas. Em cada posição do vetor somaLinhas deverá ser armazenada a soma da linha correspondente na matriz A. Da mesma forma, em cada posição do vetor somaColunas deverá ser armazenada a soma da coluna correspondente na matriz A.

public class Ex91PreencherMatriz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matriz = new int[5][5];
            int[] colSum = new int[5];
            int[] rowSum = new int[5];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("Digite um valor: ");
                    matriz[i][j] = scanner.nextInt();

                    rowSum[i] += matriz[i][j];
                    colSum[j] += matriz[i][j];
                }
            }

            System.out.println("\nMatriz: ");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.print("\nSoma das linhas: ");

            for (int i = 0; i < rowSum.length; i++) {
                System.out.print(rowSum[i] + " ");
            }

            System.out.print("\nSoma das colunas: ");

            for (int i = 0; i < colSum.length; i++) {
                System.out.print(colSum[i] + " ");
            }
        }
    }
}
