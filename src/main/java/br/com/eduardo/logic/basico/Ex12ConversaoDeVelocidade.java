package br.com.eduardo.logic.basico;

// * 12. Faça um algoritmo que transforme uma velocidade fornecida em m/s pelo usuário para Km/h.Para tal,multiplique o valor em m/s por 3,6.

import java.util.Scanner;

public class Ex12ConversaoDeVelocidade {
    public static void main(String[] args) {
        final double FATOR_CONVERSAO = 3.6;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite velocidade em m/s: ");
            double ms = scanner.nextDouble();
            if (ms >= 0) {
                double vel = ms * FATOR_CONVERSAO;
                System.out.printf("A velocidade é de %.1f km/h", vel);
            } else {
                System.out.println("Erro. A velocidade não pode ser negativa.");
            }
        }
    }
}
