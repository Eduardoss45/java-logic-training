package br.com.eduardo.logic.basico;

// * 5. Ler um número inteiro e exibir o seu sucessor.

import java.util.Scanner;

public class Ex05Sucessor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero == Integer.MAX_VALUE) {
                System.out.println("Não é possível calcular o sucessor, pois o valor excede o limite do tipo int.");
            } else {
                int sucessor = numero + 1;
                System.out.printf("O sucessor do número %d é %d%n", numero, sucessor);
            }
        }
    }
}
