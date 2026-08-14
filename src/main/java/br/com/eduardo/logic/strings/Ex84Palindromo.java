package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 84. Escreva um programa em Java que verifique se uma string normalizada é palíndrome (os mesmos caracteres quando lida da direita para a esquerda).

public class Ex84Palindromo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String word = scanner.next().toLowerCase();

            int left = 0;
            int right = word.length() - 1;
            boolean palindrome = true;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    palindrome = false;
                    break;
                }

                left++;
                right--;
            }

            if (!palindrome) {
                System.out.printf("A palavra %s não é palindromo.", word);
                return;
            }

            System.out.printf("A palavra %s é palindromo.", word);
        }
    }
}
