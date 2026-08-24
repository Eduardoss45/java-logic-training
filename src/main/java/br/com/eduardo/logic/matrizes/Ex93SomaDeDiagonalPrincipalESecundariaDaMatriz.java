package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 93. Faça um programa em Java para ler valores e armazená-los em uma matriz D 5 x 5. A seguir o programa deverá calcular a soma dos valores que compõem a diagonal principal e a diagonal secundária da matriz.

public class Ex93SomaDeDiagonalPrincipalESecundariaDaMatriz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matriz = new int[5][5];
            System.out.print("Digite 25 números: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }

            int somaPrincipal = 0;
            int somaSecundaria = 0;

            for (int i = 0; i < matriz.length; i++) {
                somaPrincipal += matriz[i][i];
                somaSecundaria += matriz[i][matriz.length - 1 - i];
            }

            System.out.println("Soma da diagonal principal: " + somaPrincipal);
            System.out.println("Soma da diagonal secundária: " + somaSecundaria);
        }
    }
}
