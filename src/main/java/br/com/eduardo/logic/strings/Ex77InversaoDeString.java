// * 77. Escreva um programa em Java, que leia uma string, gere uma nova string com o texto invertido e imprima esta nova string

package br.com.eduardo.logic.strings;

import java.util.Scanner;

public class Ex77InversaoDeString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String word = scanner.next();
            
            char[] vetor = new char[word.length()];

            int j = 0;
            for (int i = vetor.length - 1; i >= 0; i--) {
                char letter = word.charAt(i);
                vetor[j] = letter;
                j++;
            }

            System.out.println(new String(vetor));
        }
    }
}
