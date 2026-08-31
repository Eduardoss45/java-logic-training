package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 100. Verificar se uma matriz dada forma um Quadrado Latino de ordem N, no qual em cada linha e em cada coluna aparecem todos os inteiros 1, 2, 3...N, ou seja, cada linha ou coluna é permutação dos N primeiros números inteiros.

public class Ex100QuadradoLatino {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a ordem da matriz: ");
            int n = scanner.nextInt();

            int[][] matriz = new int[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("Matriz[%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            boolean quadradoLatino = true;

            for (int i = 0; i < matriz.length; i++) {
                boolean[] encontrado = new boolean[n];

                for (int j = 0; j < matriz[i].length; j++) {
                    int valor = matriz[i][j];
                    if (valor < 1 || valor > n) {
                        quadradoLatino = false;
                        break;
                    }

                    if (encontrado[valor - 1]) {
                        quadradoLatino = false;
                        break;
                    }

                    encontrado[valor - 1] = true;
                }
            }

            if (quadradoLatino) {
                System.out.println("A matriz é um quadrado latino.");
            } else {
                System.out.println("A matriz não é um quadrado latino.");
            }
        }
    }
}
