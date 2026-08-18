package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 87. Escreva um programa em Java, que verifique se duas strings são iguais, independente da caixa das letras. Por exemplo, este programa deve dizer que “Teste” é igual a “TeStE”.

public class Ex87NormalizarECompararStrings {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a primeira palavra: ");
            String word1 = scanner.next();

            System.out.print("Digite a segunda palavra: ");
            String word2 = scanner.next();

            String normalizedWord1 = word1.toLowerCase();
            String normalizedWord2 = word2.toLowerCase();

            if (normalizedWord1.equals(normalizedWord2)) {
                System.out.printf("As palavras %s e %s são iguais.", word1, word2);
            } else {
                System.out.printf("As palavras %s e %s são diferentes.", word1, word2);
            }
        }
    }
}
