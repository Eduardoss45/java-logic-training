package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 86. Escreva um número que leia um número em Romano e imprima o equivalente em decimal (base 10).

public class Ex86RomanoParaDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char[] simbolos = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
            int[] valor = { 1, 5, 10, 50, 100, 500, 1000 };

            System.out.print("Digite um número romano: ");
            String rom = scanner.next().toUpperCase();

            int dec = 0;

            for (int i = 0; i < rom.length(); i++) {
                char c1 = rom.charAt(i);

                int tempVal = 0;

                if (i < rom.length() - 1) {
                    char c2 = rom.charAt(i + 1);
                    for (int j = 0; j < simbolos.length; j++) {
                        if (simbolos[j] == c2) {
                            tempVal = valor[j];
                            break;
                        }
                    }
                }

                for (int j = 0; j < simbolos.length; j++) {
                    if (simbolos[j] == c1) {
                        if (tempVal > valor[j]) {
                            dec -= valor[j];
                        } else {
                            dec += valor[j];
                        }
                        break;
                    }
                }
            }

            System.out.printf("O número romano %s convertido em decimal é %d", rom, dec);
        }
    }
}