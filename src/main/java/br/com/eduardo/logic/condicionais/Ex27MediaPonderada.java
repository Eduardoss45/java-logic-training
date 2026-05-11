package br.com.eduardo.logic.condicionais;

// * 27. Escreva um programa que leia 3 números e calcule a média ponderada entre eles. Considere que o maior número recebe peso 5 e os outros dois recebem peso 2,5.

import java.util.Scanner;

public class Ex27MediaPonderada {
    public static void main(String[] args) {
        final int PESO_MAX = 5;
        final double PESO_MIN = 2.5f;
        final double PESO_TOTAL = PESO_MAX + (PESO_MIN * 2);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            System.out.print("Digite o terceiro número: ");
            int n3 = scanner.nextInt();

            double primeiroNumero;
            double segundoNumero;
            double terceiroNumero;
            double somaPonderada;

            if (n1 >= n2 && n1 >= n3) {
                primeiroNumero = n1 * PESO_MAX;
                segundoNumero = n2 * PESO_MIN;
                terceiroNumero = n3 * PESO_MIN;
            } else if (n2 >= n1 && n2 >= n3) {
                primeiroNumero = n2 * PESO_MAX;
                segundoNumero = n1 * PESO_MIN;
                terceiroNumero = n3 * PESO_MIN;
            } else {
                primeiroNumero = n3 * PESO_MAX;
                segundoNumero = n1 * PESO_MIN;
                terceiroNumero = n2 * PESO_MIN;
            }

            somaPonderada = primeiroNumero + segundoNumero + terceiroNumero;

            double res = somaPonderada / PESO_TOTAL;

            System.out.printf("A média ponderada dos números (%d, %d, %d) é %.2f", n1, n2, n3, res);
        }
    }
}