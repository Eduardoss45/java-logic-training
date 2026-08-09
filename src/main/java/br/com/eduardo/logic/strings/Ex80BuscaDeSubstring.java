package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 80. Escreva um programa em Java que leia duas string e informe se a primeira contém a segunda.

public class Ex80BuscaDeSubstring {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String word1 = scanner.next();

            System.out.print("Digite outra palavra: ");
            String word2 = scanner.next();

            boolean itFound = false;

            for (int i = 0; i <= word1.length() - word2.length(); i++) {

                boolean corresponds = true;

                for (int j = 0; j < word2.length(); j++) {
                    if (word1.charAt(i + j) != word2.charAt(j)) {
                        corresponds = false;
                        break;
                    }
                }

                if (corresponds) {
                    itFound = true;
                    break;
                }

            }

            if (itFound) {
                System.out.println("A primeira string contém a segunda.");
            } else {
                System.out.println("A primeira string não contém a segunda.");
            }
        }
    }
}
