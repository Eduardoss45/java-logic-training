package br.com.eduardo.logic.condicionais;

// * 21. Escreva um programa que leia um número e exiba se ele é positivo ou negativo.

import java.util.Scanner;

public class Ex21PositivoOuNegativo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.printf("O número %d é positivo.%n", numero);
            } else if (numero < 0) {
                System.out.printf("O número %d é negativo.%n", numero);
            } else {
                System.out.println("O número zero é neutro, portanto não é positivo nem negativo.");
            }
        }
    }
}
