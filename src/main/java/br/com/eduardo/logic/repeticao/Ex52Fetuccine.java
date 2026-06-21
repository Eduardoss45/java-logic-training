package br.com.eduardo.logic.repeticao;

import java.util.Scanner;

// * 52. A série de FETUCCINE é gerada da seguinte forma: os dois primeiros termos são fornecidos pelo usuário; a partir daí, os termos são gerados com a soma ou subtração dos dois termos anteriores, ou seja: 1. Ai = Ai - 1 + Ai - 2, para i ímpar 2. Ai = Ai - 1 - Ai - 2, para i par

public class Ex52Fetuccine {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite A1:");
            int a1 = scanner.nextInt();
            System.out.print("Digite A2:");
            int a2 = scanner.nextInt();
            System.out.print("Digite N:");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erro. N não pode ser um igual ou menor que zero.");
                return;
            }

            System.out.printf("A1 = %d;%n", a1);
            System.out.printf("A2 = %d;%n", a2);

            for (int i = 3; i <= n; i++) {

                int aI;

                if (i % 2 == 0) {
                    aI = a2 - a1;
                } else {
                    aI = a2 + a1;
                }

                a1 = a2;
                a2 = aI;

                System.out.printf("A%d = %d;%n", i, aI);
            }
        }
    }
}
