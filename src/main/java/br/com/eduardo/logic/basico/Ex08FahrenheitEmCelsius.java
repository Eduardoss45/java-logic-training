package br.com.eduardo.logic.basico;

// * 8. Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F – 32), leu um valor de temperatura em Fahrenheit e exibi-lo em Celsius

import java.util.Scanner;

public class Ex08FahrenheitEmCelsius {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.printf("A temperatura em Celsius é de %.2f°C", celsius);
        }
    }
}
