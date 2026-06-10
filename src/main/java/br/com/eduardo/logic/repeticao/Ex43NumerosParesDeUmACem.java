package br.com.eduardo.logic.repeticao;

// * 43. Escreva um programa que imprima todos os números pares do intervalo fechado de 1 a 100. 

public class Ex43NumerosParesDeUmACem {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            if (i % 10 == 0) {
                System.out.printf("%d%n", i);
            } else {
                System.out.printf("%d, ", i);
            }
        }
    }
}
