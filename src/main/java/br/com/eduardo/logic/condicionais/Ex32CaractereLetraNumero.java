package br.com.eduardo.logic.condicionais;

// * 32. Escreva um programa que leia um caracter e diga se ele é uma vogal, consoante, número ou um símbolo (qualquer outro caracter, que não uma letra ou número).

import java.util.Scanner;

public class Ex32CaractereLetraNumero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite algum caractere: ");
            char caractere = Character.toLowerCase(scanner.next().charAt(0));

            if (Character.isLetter(caractere)) {
                switch (caractere) {
                    case 'a', 'e', 'i', 'o', 'u' ->
                        System.out.println("É vogal.");
                    default ->
                        System.out.println("É consoante.");
                }
            } else if (Character.isDigit(caractere)) {
                System.out.println("É um número.");
            } else {
                System.out.println("É um símbolo.");
            }
        }
    }
}
