package br.com.eduardo.logic.basico;

// * 4. Dado os três lados de um triângulo determinar o perímetro do mesmo.

import java.util.Scanner;

public class Ex04Triangulo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o tamanho do primeiro lado do triângulo: ");
            double l1 = scanner.nextDouble();
            System.out.print("Digite o tamanho do segundo lado: ");
            double l2 = scanner.nextDouble();
            System.out.print("Digite o tamanho do terceiro lado: ");
            double l3 = scanner.nextDouble();
            if (l1 > 0 && l2 > 0 && l3 > 0 && l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
                double perimetro = l1 + l2 + l3;
                System.out.printf("O perimetro do triângulo é: %.2f%n", perimetro);
            } else {
                System.out.println("Valor inválido. Os lados informados não formam um triângulo.");
            }
        }
    }
}
