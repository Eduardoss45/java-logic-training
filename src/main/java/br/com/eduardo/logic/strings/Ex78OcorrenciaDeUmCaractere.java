package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 78. Escreva um programa em Java, que leia uma string e um caracter e conte o número de ocorrências do caracter lido na string.

public class Ex78OcorrenciaDeUmCaractere {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String word = scanner.next().toLowerCase();

            System.out.print("Digite um caractér: ");
            char character = scanner.next().charAt(0);

            int count = 0;

            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (letter == character) {
                    count++;
                }
            }

            System.out.printf("O caractere %s ocorre %d vezes na palavra %s.", character, count, word);
        }
    }
}
