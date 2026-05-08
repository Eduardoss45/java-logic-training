package br.com.eduardo.logic.condicionais;

import java.util.Scanner;

// * 24. Escreva um programa que leia três números e mostre o maior entre eles.

public class Ex24MaiorNumero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            System.out.print("Digite o terceiro número: ");
            int n3 = scanner.nextInt();

            int res;

            if (n1 >= n2 && n1 >= n3) {
                res = n1;
            } else if (n2 >= n1 && n2 >= n3) {
                res = n2;
            } else {
                res = n3;
            }

            System.out.printf("O maior número é %d.", res);
        }
    }
}
