package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 81. Escreva um programa em Java que normalize uma string lida, em uma nova string. Normalizar uma string é o processo de remover os espaços excedentes que separam as palavras.

public class Ex81NormalizacaoDeString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String phrase = scanner.nextLine();

            String normalizedSentence = "";
            boolean lastSpace = false;

            for (int i = 0; i < phrase.length(); i++) {
                char character = phrase.charAt(i);

                if (character == ' ') {
                    if (!lastSpace) {
                        normalizedSentence += character;
                        lastSpace = true;
                    }
                } else {
                    normalizedSentence += character;
                    lastSpace = false;
                }
            }

            System.out.printf("%n%s", normalizedSentence);
        }
    }
}
