package br.com.eduardo.logic.repeticao;

import java.util.Scanner;

// * 45. Escreva um programa que leia 5 números, e imprima a média entre eles.

public class Ex45MediaDeCincoNumeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int soma = 0;
            double media;
            for (int i = 1; i <= 5; i++) {
                System.out.printf("Digite o %dº número: ", i);
                soma += scanner.nextInt();
            }
            media = (double) soma / 5;
            System.out.printf("A média dos cinco números é %.2f", media);
        }
    }
}
