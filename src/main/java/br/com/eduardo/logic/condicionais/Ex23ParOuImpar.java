package br.com.eduardo.logic.condicionais;

// * 23. Escreva um programa que leia um número e imprima se este número é ou não par.

import java.util.Scanner;

public class Ex23ParOuImpar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.printf("O número %d é par.", numero);
            } else {
                System.out.printf("O número %d é ímpar.", numero);
            }
        }
    }
}
