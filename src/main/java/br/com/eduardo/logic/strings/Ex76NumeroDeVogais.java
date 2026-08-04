package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 76. Escreva um programa em Java, que leia uma string e conte quantas ocorrências de vogais existem nesta string.

public class Ex76NumeroDeVogais {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char[] vogais = { 'a', 'e', 'i', 'o', 'u' };

            System.out.print("Digite uma palavra: ");
            String word = scanner.next();
            word = word.toLowerCase();

            int count = 0;

            for (int i = 0; i < word.length(); i++) {
                char w = word.charAt(i);
                for (int j = 0; j < vogais.length; j++) {
                    if (w == vogais[j]) {
                        count++;
                        break;
                    }
                }
            }

            System.out.printf("Existem %d vogais na palavra %s.", count, word);
        }
    }
}
