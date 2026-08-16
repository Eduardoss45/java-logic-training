package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 85. Escreva um programa que leia uma string representando um número hexadecimal (base 16) e imprima sua representação em decimal (base 10). 

public class Ex85RepresentacaoDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um valor hexadecimal: ");
            String hex = scanner.nextLine();
            float dec = 0;

            for (int i = 0; i < hex.length(); i++) {
                char c = hex.charAt(i);
                int v;

                switch (c) {
                    case '0' -> {
                        v = 0;
                    }
                    case '1' -> {
                        v = 1;
                    }
                    case '2' -> {
                        v = 2;
                    }
                    case '3' -> {
                        v = 3;
                    }
                    case '4' -> {
                        v = 4;
                    }
                    case '5' -> {
                        v = 5;
                    }
                    case '6' -> {
                        v = 6;
                    }
                    case '7' -> {
                        v = 7;
                    }
                    case '8' -> {
                        v = 8;
                    }
                    case '9' -> {
                        v = 9;
                    }
                    case 'A' -> {
                        v = 10;
                    }
                    case 'B' -> {
                        v = 11;
                    }
                    case 'C' -> {
                        v = 12;
                    }
                    case 'D' -> {
                        v = 13;
                    }
                    case 'E' -> {
                        v = 14;
                    }
                    case 'F' -> {
                        v = 15;
                    }
                    default -> {
                        System.out.println("Erro. O valor digitado não é um hexadecimal.");
                        return;
                    }
                }

                int expoente = hex.length() - 1 - i;
                dec += v * Math.pow(16, expoente);
            }

            System.out.printf("O valor hexadecimal %s é representado pelo decimal %.0f", hex, dec);
        }
    }
}
