package br.com.eduardo.logic.basico;

// * 1. Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu perímetro.

import java.util.Scanner;

public class Ex01Retangulo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o tamanho da base: ");
            double base = scanner.nextDouble();

            System.out.println("Digite a altura: ");
            double altura = scanner.nextDouble();

            if (base > 0 && altura > 0) {
                double area = base * altura;
                double perimetro = 2 * (base + altura);
                System.out.printf("A área é: %.2f%n", area);
                System.out.printf("O perímetro é: %.2f%n", perimetro);
            } else {
                System.out.println("Valores inválidos.");
            }
        }
    }
}