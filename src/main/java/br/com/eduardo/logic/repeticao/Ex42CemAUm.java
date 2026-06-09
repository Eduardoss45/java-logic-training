package br.com.eduardo.logic.repeticao;

// * 42. Escreva um programa que imprima todos os números inteiros de 100 a 1 (em ordem decrescente).

public class Ex42CemAUm {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 10 == 0 && i != 100) {
                System.out.printf("%d%n", i);
            } else if (i != 1) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}
