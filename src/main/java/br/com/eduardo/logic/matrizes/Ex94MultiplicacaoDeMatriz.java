package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 94. Escrever um algoritmo e implementá-lo em linguagem java que leia uma matriz de valores inteiros 6 por 6 e um valor inteiro qualquer,posteriormente multiplicar a matriz pelo valor lido e colocar o resultado na própria matriz.

public class Ex94MultiplicacaoDeMatriz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matriz = new int[6][6];
            System.out.println("Digite 36 números: ");
            int c = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%d/36: ", c);
                    matriz[i][j] = scanner.nextInt();
                    c++;
                }
            }

            System.out.print("Digite o valor multiplicador: ");
            int multiplicator = scanner.nextInt();

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] *= multiplicator;
                }
            }

            System.out.println("Matriz após multiplicação:");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
