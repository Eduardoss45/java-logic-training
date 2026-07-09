package br.com.eduardo.logic.repeticao;

import java.util.Scanner;

// * 56. Um número se diz perfeito se é igual à soma de seus divisores próprios. Divisores próprios de um número positivo N são todos os divisores inteiros positivos de N exceto o próprio N. Por exemplo, o número 6, seus divisores próprios são 1, 2 e 3, cuja soma é igual à 6 (1 + 2 + 3 = 6). Outro exemplo é o número 28, cujos divisores próprios são 1, 2, 4, 7 e 14, e a soma dos seus divisores próprios é 28 (1 + 2 + 4 + 7 + 14 = 28). 

public class Ex56NumeroPerfeito {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erro. O número deve ser maior que zero.");
                return;
            }

            int somaN = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    somaN += i;
                }
            }

            if (somaN == n) {
                System.out.printf("O número %d é perfeito.", n);
            } else {
                System.out.printf("O número %d não é perfeito.", n);
            }
        }
    }
}
