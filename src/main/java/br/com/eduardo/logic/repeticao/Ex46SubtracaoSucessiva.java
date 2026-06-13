package br.com.eduardo.logic.repeticao;

// * 46. Escreva um programa que calcule o quociente da divisão de A por B (número inteiros e positivos), ou seja, A/B, através de subtrações sucessivas. Esses dois valores são passados pelo usuário através do teclado.

import java.util.Scanner;

public class Ex46SubtracaoSucessiva {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite A (inteiro): ");
            int a = scanner.nextInt();
            int aTemp = a;

            System.out.print("Digite B (inteiro): ");
            int b = scanner.nextInt();

            if (a <= 0 || b <= 0) {
                System.out.println("Erro. Os valores A/B devem ser maiores zero.");
                return;
            }

            int quociente = 0;
            while (aTemp >= b) {
                aTemp -= b;
                quociente++;
            }

            System.out.printf("O quociente de A(%d) e B(%d) é %d, com resto %d ", a, b, quociente, aTemp);
        }
    }
}
