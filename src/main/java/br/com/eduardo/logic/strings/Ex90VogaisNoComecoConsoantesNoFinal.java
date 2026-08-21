package br.com.eduardo.logic.strings;

import java.util.Scanner;

//* 90. Escreva um programa em Java, que dado uma string, crie uma nova string contendo na ordem em que aparecem no string dado,as vogais no começo e as consoantes no final.

public class Ex90VogaisNoComecoConsoantesNoFinal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char[] vogais = { 'a', 'e', 'i', 'o', 'u' };

            System.out.print("Digite uma palavra: ");
            String word = scanner.next().toLowerCase();

            String vowels = "";
            String consonants = "";

            for (int i = 0; i < word.length(); i++) {
                boolean isVowel = false;
                char c = word.charAt(i);

                for (int j = 0; j < vogais.length; j++) {
                    if (c == vogais[j]) {
                        isVowel = true;
                        break;
                    }
                }

                if (isVowel) {
                    vowels += c;
                } else {
                    consonants += c;
                }
            }

            String result = vowels + consonants;

            System.out.printf("A palavra \"%s\" reorganizada ficou \"%s\".", word, result);
        }
    }
}
