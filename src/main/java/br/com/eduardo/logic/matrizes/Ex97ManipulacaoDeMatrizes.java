package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 97. Escrever um algoritmo e implementá-lo em linguagem Java que leia uma matriz de valores inteiros 5 por 5 e a exiba. A seguir, leia dois números x e y e em seguida troque a x-ésima linha pela y-ésima linha, a x-ésima coluna com a y-ésima coluna, a diagonal principal com a secundária e, por fim mostre a matriz assim modificada

public class Ex97ManipulacaoDeMatrizes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matriz = new int[5][5];

            System.out.println("Digite 25 valores.");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("[%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nMatriz original:");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.print("Digite o valor de x (1 a 5): ");
            int x = scanner.nextInt() - 1;

            System.out.print("Digite o valor de y (1 a 5):");
            int y = scanner.nextInt() - 1;

            for (int j = 0; j < matriz[x].length; j++) {
                int temp = matriz[x][j];
                matriz[x][j] = matriz[y][j];
                matriz[y][j] = temp;
            }

            for (int i = 0; i < matriz.length; i++) {
                int temp = matriz[i][x];
                matriz[i][x] = matriz[i][y];
                matriz[i][y] = temp;
            }

            for (int c = 0; c < matriz.length; c++) {
                int temp = matriz[c][c];
                matriz[c][c] = matriz[c][matriz.length - 1 - c];
                matriz[c][matriz.length - 1 - c] = temp;
            }

            System.out.println("\nMatriz modificada:");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
