package br.com.eduardo.logic.basico;

// * 19. Escreva um programa que calcule a raiz de uma equação do primeiro grau.

import java.util.Scanner;

public class Ex19EquacaoDePrimeiroGrau {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor de a (coeficiente de x): ");
            double a = scanner.nextDouble();

            System.out.print("Digite o valor de b (termo constante): ");
            double b = scanner.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("A equação possui infinitas soluções.");
                } else {
                    System.out.println("A equação não possui solução.");
                }
                return;
            }

            double x = -b / a;
            System.out.printf("A solução da equação %.2fx %s %.2f = 0 é x = %.2f%n",
                    a,
                    (b >= 0 ? "+" : "-"),
                    Math.abs(b),
                    x);
        }
    }
}
