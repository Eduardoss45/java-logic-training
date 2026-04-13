package br.com.eduardo.logic.basico;

// * 2. Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.

import java.util.Scanner;

public class Ex02Quadrado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o tamanho de um dos lados do quadrado: ");
            double lado = scanner.nextDouble();
            if (lado > 0) {
                double area = lado * lado;
                double perimetro = 4 * lado;
                System.out.printf("A área do quadrado é: %.2f%n", area);
                System.out.printf("O seu perímetro é: %.2f%n", perimetro);
            } else {
                System.out.println("Valor inválido.");
            }
        }
    }
}
