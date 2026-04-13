package br.com.eduardo.logic.basico;

// * 9. Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado seu raio e sua altura.

import java.util.Scanner;

public class Ex09VolumeLataDeOleo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o raio da lata: ");
            double raio = scanner.nextDouble();
            System.out.print("Digite a altura da lata: ");
            double altura = scanner.nextDouble();
            if (raio > 0 && altura > 0) {
                double volume = (Math.PI * Math.pow(raio, 2)) * altura;
                System.out.printf("O volume da lata é de %.2f cm³", volume);
            } else {
                System.out.println("Valores inválidos. O raio e a altura devem ser maiores que zero.");
            }
        }
    }
}
