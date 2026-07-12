package br.com.eduardo.logic.repeticao;

import java.util.Scanner;

// * 59.  O número e (número de Euler) pode ser representado e calculado por meio da utilização da série de Taylor para e quando x=1,como a soma da seguinte série infinita: e = 1 + 1/1! + 1/2! + 1/3! + ⋯ + 1/n!. Escreva um programa, que leia o número de termos da série(n)e imprima como saída, o cálculo do número de Euler para cada um dos n primeiros elementos da série.

public class Ex59AproximacaoDoNumeroDeEuler {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erro. O número de entrada não pode ser menor ou igual a zero.");
                return;
            }

            double soma = 1;
            double fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial = fatorial * i;
                soma += 1 / fatorial;
                System.out.printf("O valor aproximado de e é %.6f.%n", soma);
            }
        }
    }
}
