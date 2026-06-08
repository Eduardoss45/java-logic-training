package br.com.eduardo.logic.repeticao;

// * 41. Escreva um programa que imprima todos os números inteiros do intervalo fechado de 1 a 100.

public class Ex41ImprimirUmACem {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i != 100) {
                if (i % 10 == 0) {
                    System.out.printf("%d%n", i);
                } else {
                    System.out.printf("%d,", i);
                }
            } else {
                System.out.printf("%d", i);
            }
        }
    }
}
