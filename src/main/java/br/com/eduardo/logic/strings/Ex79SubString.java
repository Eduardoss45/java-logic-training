package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 79. Escreva um programa em Java, que gere a substring de uma string original, dado a posição inicial e a final da substring.

public class Ex79SubString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String word = scanner.next();
            int limit = word.length();

            System.out.printf("Digite o primeiro ponto de 1 a %d (menor que o segundo ponto): ", limit);
            int p1 = scanner.nextInt();

            System.out.printf("Digite o segundo ponto de 1 a %d (maior que o segundo ponto): ", limit);
            int p2 = scanner.nextInt();

            if (p1 < 1 || p2 > limit || p1 >= p2) {
                System.out.println("Erro. Os valores dos pontos não são válidos.");
                return;
            }

            int size = p2 - p1 + 1;

            char[] result = new char[size];

            int j = 0;

            for (int i = p1 - 1; i < p2; i++) {
                result[j] = word.charAt(i);
                j++;
            }

            String substring = new String(result);

            System.out.println(substring);
        }
    }
}
