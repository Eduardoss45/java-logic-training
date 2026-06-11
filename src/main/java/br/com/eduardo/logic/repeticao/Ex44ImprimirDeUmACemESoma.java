package br.com.eduardo.logic.repeticao;

// * 44. Escreva um programa que imprima todos os números de 1 até 100, inclusive, e a soma de todos eles.

public class Ex44ImprimirDeUmACemESoma {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 0) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d%n", i);
            }
            total += i;
        }
        System.out.printf("A soma de 1 a 100 é: %d", total);
    }
}
