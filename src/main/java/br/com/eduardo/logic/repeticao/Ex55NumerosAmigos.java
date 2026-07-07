package br.com.eduardo.logic.repeticao;

import java.util.Scanner;

// * 55. Dizemos que dois números são amigos se cada um deles é igual a soma dos divisores próprios do outro. Os divisores próprios de um número positivo N são todos os divisores inteiros positivos de N exceto o próprio N. Um exemplo de números amigos são 284 e 220,  pois os divisores próprios de 220 são 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 e 110. Efetuando a soma destes números obtemos o resultado 284 (1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284). Os divisores próprios de 284 são 1, 2, 4, 71 e 142, efetuando a soma destes números obtemos o resultado 220 (1 + 2 + 4 + 71 + 142 = 220). Escreva um programa que dado dois inteiros, verifique se eles são amigos. (17296 e 18416 são amigos, por exemplo).

public class Ex55NumerosAmigos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número A: ");
            int a = scanner.nextInt();

            System.out.print("Digite o número B: ");
            int b = scanner.nextInt();

            if (a <= 0 || b <= 0) {
                System.out.println("Erro. Os valores dos números A e B devem ser maiores que zero.");
                return;
            }

            int somaA = 0;
            int somaB = 0;

            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    somaA += i;
                }
            }

            for (int j = 1; j < b; j++) {
                if (b % j == 0) {
                    somaB += j;
                }
            }

            if (somaA == b && somaB == a) {
                System.out.printf("Os números A(%d) e B(%d) são amigos.", a, b);
            } else {
                System.out.printf("Os números A(%d) e B(%d) não são amigos.", a, b);
            }
        }
    }
}
