package br.com.eduardo.logic.condicionais;

// * 22. Escreva um programa que leia um número e exiba o seu módulo.

import java.util.Scanner;

public class Ex22ModuloDeUmNumero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int res;
            
            if (numero > 0) {
                res = numero;
                System.out.printf("O modulo de %d é %d", numero, res);
            } else if (numero < 0) {
                res = numero * -1;
                System.out.printf("O modulo de %d é %d", numero, res);
            } else {
                res = 0;
                System.out.printf("O módulo de %d é %d%n", numero, res);
            }
        }
    }
}
