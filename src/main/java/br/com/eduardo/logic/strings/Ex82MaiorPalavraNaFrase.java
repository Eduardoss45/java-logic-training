package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 82. Escreva um programa em Java, que dada uma string (normalizada), imprima a maior palavra dela.

public class Ex82MaiorPalavraNaFrase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String phrase = scanner.nextLine().toLowerCase();

            String normalizedSentense = "";
            boolean lastSpace = false;

            for (int i = 0; i < phrase.length(); i++) {
                char character = phrase.charAt(i);

                if (character == ' ') {
                    if (!lastSpace) {
                        normalizedSentense += character;
                        lastSpace = true;
                    }
                } else {
                    normalizedSentense += character;
                    lastSpace = false;
                }
            }

            int wordLength = 0;
            int tempWordLength = 0;

            String word = "";
            String tempWord = "";

            for (int j = 0; j < normalizedSentense.length(); j++) {
                char character = normalizedSentense.charAt(j);

                if (character == ' ') {

                    if (tempWordLength > wordLength) {
                        wordLength = tempWordLength;
                        word = tempWord;
                    }

                    tempWordLength = 0;
                    tempWord = "";

                } else {
                    tempWordLength++;
                    tempWord += character;
                }
            }

            if (tempWordLength > wordLength) {
                wordLength = tempWordLength;
                word = tempWord;
            }

            System.out.printf("A maior palavra da frase é: '%s' com %d letras.", word, wordLength);
        }
    }
}
