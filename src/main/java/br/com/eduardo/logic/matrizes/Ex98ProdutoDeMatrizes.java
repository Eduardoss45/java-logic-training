package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 98. Escrever um algoritmo e implementá-lo em linguagem Java que leia duas matrizes (4x3 e 3x2), calcule e imprima a matriz que representa o produto entre as duas matrizes lidas.

public class Ex98ProdutoDeMatrizes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matrizA = new int[4][3];
            int[][] matrizB = new int[3][2];
            int[][] resultado = new int[4][2];

            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    System.out.printf("A[%d][%d]: ", i, j);
                    matrizA[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    System.out.printf("B[%d][%d]: ", i, j);
                    matrizB[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizB[0].length; j++) {
                    for (int k = 0; k < matrizB.length; k++) {
                        resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            System.out.println("\nMatriz resultado:");

            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[i].length; j++) {
                    System.out.print(resultado[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
