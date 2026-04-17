package br.com.eduardo.logic.basico;

// * 16. Escreva um programa para gerar o invertido de um número com três algarismos (exemplo: o invertido de 498 é 894).

import java.util.Scanner;

public class Ex16InverterAlgarismo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número com três algarismos: ");
            int n = scanner.nextInt();
            if (n >= 100 && n <= 999) {
                int c = n / 100;
                int d = (n % 100) / 10;
                int u = n % 10;
                int resultado = (u * 100) + (d * 10) + c;
                System.out.printf("O número invertido é %d", resultado);
            } else {
                System.out.println("Erro. O número deve possuir três digitos.");
            }
        }
    }
}
