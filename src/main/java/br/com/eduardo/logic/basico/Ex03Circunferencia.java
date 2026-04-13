package br.com.eduardo.logic.basico;

// * 3. Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.

import java.util.Scanner;

public class Ex03Circunferencia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o tamanho do raio da circunferência: ");
            double raio = scanner.nextDouble();
            if (raio > 0) {
                double perimetro = 2 * Math.PI * raio;
                double area = Math.PI * Math.pow(raio, 2);
                System.out.printf("O perímetro da circunferência é: %.2f%n", perimetro);
                System.out.printf("A sua área é de: %.2f%n", area);
            } else {
                System.out.println("Valor inválido. O raio deve ser maior que zero.");
            }
        }
    }
}
