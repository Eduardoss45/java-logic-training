package br.com.eduardo.logic.basico;

// * 17. Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado para o cliente que realizou o saque. Um possível critério seria o da "distribuição ótima" no sentido de que as notas de menor valor fossem distribuídas em número mínimo possível. Por exemplo, se a quantia solicitada fosse R$ 87,00, o programa deveria indicar uma nota de R$ 50,00, três notas de R$ 10,00, uma nota de R$ 5,00 e duas notas de R$ 1,00. Escreva um programa que receba o valor da quantia solicitada e retorne a distribuição das notas de acordo com o critério da distribuição ótima (considere existir notas de R$1,00; R$2,00; R$5,00; R$10,00; R$20,00; R$50,00 e R$100,00).

import java.util.Scanner;

public class Ex17CaixaEletronico {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do saque: ");
            int valorSaque = scanner.nextInt();

            if (valorSaque <= 0) {
                System.out.println("Valor inválido. O valor do saque deve ser um número inteiro positivo.");
                return;
            }

            int restante = valorSaque;

            int cem = restante / 100;
            restante %= 100;

            int cinquenta = restante / 50;
            restante %= 50;

            int vinte = restante / 20;
            restante %= 20;

            int dez = restante / 10;
            restante %= 10;

            int cinco = restante / 5;
            restante %= 5;

            int dois = restante / 2;
            restante %= 2;

            int um = restante;

            System.out.printf("Notas de R$100: %d%n", cem);
            System.out.printf("Notas de R$50: %d%n", cinquenta);
            System.out.printf("Notas de R$20: %d%n", vinte);
            System.out.printf("Notas de R$10: %d%n", dez);
            System.out.printf("Notas de R$5: %d%n", cinco);
            System.out.printf("Notas de R$2: %d%n", dois);
            System.out.printf("Notas de R$1: %d", um);
        }
    }
}
