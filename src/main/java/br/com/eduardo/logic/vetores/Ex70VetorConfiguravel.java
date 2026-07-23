package br.com.eduardo.logic.vetores;

import java.util.Scanner;

// * 70. Escreva um programa que carregue um array com tamanho variável. O tamanho máximo do array é de 100 posições (carga de array com sentinela).

public class Ex70VetorConfiguravel {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetor = new int[100];

            int quantity = 0;

            while (quantity < vetor.length) {
                System.out.print("Digite um número inteiro positivo (-1 determina o ponto de parada): ");
                int item = scanner.nextInt();

                if (item < -1) {
                    System.out.println(
                            "Erro. Não é permitido a inserção de números menores que -1.");
                    return;
                } else if (item == -1) {
                    System.out.print("\n".repeat(40));
                    System.out.println("Programa finalizado.");
                    System.out.print("Vetor: [");

                    for (int i = 0; i < quantity; i++) {
                        System.out.print(vetor[i]);

                        if (i < quantity - 1) {
                            System.out.print(", ");
                        }
                    }

                    System.out.println("]");
                    break;
                }

                vetor[quantity] = item;
                quantity++;

                System.out.print("\n".repeat(40));
                System.out.print("Vetor: [");

                for (int i = 0; i < quantity; i++) {
                    System.out.print(vetor[i]);

                    if (i < quantity - 1) {
                        System.out.print(", ");
                    }
                }

                System.out.println("]");
            }

        }
    }
}
