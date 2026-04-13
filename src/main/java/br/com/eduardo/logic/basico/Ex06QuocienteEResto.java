package br.com.eduardo.logic.basico;

// * 6. Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Ex06QuocienteEResto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int n2 = scanner.nextInt();
            if (n2 == 0) {
                System.out.println("Não é possível realizar a divisão por zero.");
            } else {
                int quociente = n1 / n2;
                int resto = n1 % n2;
                System.out.printf("O quociente é: %d%n", quociente);
                System.out.printf("O resto da divisão é: %d%n", resto);
            }
        }
    }
}
