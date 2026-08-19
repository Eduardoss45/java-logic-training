package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 88. Escreva um programa em Java, que coloque a string lida toda em caixa alta.

public class Ex88StringEmCaixaAlta {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String word = scanner.next().toUpperCase();

            System.out.printf("Caixa alta: %s", word);
        }
    }
}
