package br.com.eduardo.logic.condicionais;

// * 29. Escreva um programa que calcula o desconto previdenciário de um funcionário. Dado um salário, o programa deve retornar o valor do desconto proporcional ao mesmo. O cálculo segue a regra: o desconto é de 11% do valor do salário, entretanto, o valor máximo de desconto é 334,29, o que seja menor.

import java.util.Scanner;

public class Ex29DescontoPrevidenciario {
    public static void main(String[] args) {
        final double TAXA = 11;
        final double LIMITE = 334.29;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do sálario: ");
            double salario = scanner.nextDouble();
            double desconto = (TAXA / 100) * salario;

            if (salario > 0) {
                if (desconto > LIMITE) {
                    desconto = LIMITE;
                }

                System.out.printf(
                        "O desconto previdenciário para o salário de R$%.2f é de R$%.2f%n",
                        salario,
                        desconto);
            } else {
                System.out.println("Erro. O salário deve ser um valor positivo.");
            }
        }
    }
}
