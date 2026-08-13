package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 83. Escreva um programa em Java que leia uma string e gere uma nova string contendo apenas a primeira ocorrência de cada caractere, mantendo a ordem original.

public class Ex83OcorrenciaDeCadaCaractere {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String word = scanner.next();

            String result = "";

            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                boolean alreadyExists = false;

                for (int j = 0; j < result.length(); j++) {
                    if (character == result.charAt(j)) {
                        alreadyExists = true;
                        break;
                    }
                }

                if (!alreadyExists) {
                    result += character;
                }

            }

            System.out.printf("%s", result);
        }
    }
}
