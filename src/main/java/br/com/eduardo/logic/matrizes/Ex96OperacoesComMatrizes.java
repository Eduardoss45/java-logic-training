package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 96. Escrever um algoritmo e implementá-lo em linguagem Java que leia duas matrizes de valores inteiros 3 por 4 e crie uma terceira matriz, que seja a soma das duas primeiras, e uma quarta, que seja a diferença entre a primeira e a segunda. Mostrar as matrizes lidas e calculadas.

public class Ex96OperacoesComMatrizes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matrizA = new int[3][4];
            int[][] matrizB = new int[3][4];

            int[][] sum = new int[3][4];
            int[][] difference = new int[3][4];

            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    System.out.printf("Digite A[%d][%d]: ", i, j);
                    matrizA[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    System.out.printf("Digite B[%d][%d]: ", i, j);
                    matrizB[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    sum[i][j] = matrizA[i][j] + matrizB[i][j];
                    difference[i][j] = matrizA[i][j] - matrizB[i][j];
                }
            }

            System.out.println("\nMatriz A:");

            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    System.out.print(matrizA[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\nMatriz B:");

            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    System.out.print(matrizB[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\nSoma de A + B:");

            for (int i = 0; i < sum.length; i++) {
                for (int j = 0; j < sum[i].length; j++) {
                    System.out.print(sum[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\nDiferença de A - B:");

            for (int i = 0; i < difference.length; i++) {
                for (int j = 0; j < difference[i].length; j++) {
                    System.out.print(difference[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
