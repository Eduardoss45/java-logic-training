package br.com.eduardo.logic.condicionais;

import java.util.Scanner;

public class Ex28EVogalOuConsoante {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma letra: ");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            if (!Character.isLetter(letra)) {
                System.out.println("Erro. O caractere informado não é uma letra.");
                return;
            }

            switch (letra) {
                case 'a', 'e', 'i', 'o', 'u' ->
                    System.out.println("É vogal.");

                default ->
                    System.out.println("É consoante.");
            }
        }
    }
}