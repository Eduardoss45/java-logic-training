package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 92. Elabore um programa em Java, para ler valores e armazená-los em uma matriz 5 x 5. Após o programa deverá responder se a matriz é ou não uma matriz simétrica. Uma matriz simétrica possui a mesma composição de valores abaixo e acima da diagonal principal.

public class Ex92MatrizSimetrica {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matriz = new int[5][5];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("Digite o valor [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            boolean symmetrical = true;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = i + 1; j < matriz[i].length; j++) {
                    if (matriz[i][j] != matriz[j][i]) {
                        symmetrical = false;
                    }
                }
            }

            if (symmetrical) {
                System.out.println("A matriz é simetrica.");
            } else {
                System.out.println("A matriz não é simetrica.");
            }
        }
    }
}
