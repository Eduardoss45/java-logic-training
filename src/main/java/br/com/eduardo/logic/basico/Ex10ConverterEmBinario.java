package br.com.eduardo.logic.basico;

// * 10. Converter um inteiro informado menor que 32 para sua representação em binário

import java.util.Scanner;

public class Ex10ConverterEmBinario {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro menor que 32: ");
            int numero = scanner.nextInt();
            if (numero <= 0 || numero < 32) {
                System.out.println("Número inválido. Informe um valor entre 0 e 32.");
            } else {
                String binario = Integer.toBinaryString(numero);
                System.out.printf("O número %d em binário é %s", numero, binario);
            }
        }
    }
}
