package br.com.eduardo.logic.condicionais;

// * 30. Um posto está vendendo combustíveis com a seguinte tabela de descontos: (álcool Até 25 litros -> desconto de 2% por litro), (acima de 25 litros -> desconto de 4% por litro), (gasolina até 25 litros -> desconto de 3% por litro), (acima de 25 litros -> desconto de 5% por litro)

import java.util.Scanner;

public class Ex30DescontoCombustivel {
    public static void main(String[] args) {
        final double PRECO_GASOLINA = 6.50;
        final double PRECO_ALCOOL = 4.10;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Escolha o combustível: ");
            System.out.printf("[1] - Álcool R$%.2f%n", PRECO_ALCOOL);
            System.out.printf("[2] - Gasolina R$%.2f%n", PRECO_GASOLINA);

            int escolha = scanner.nextInt();

            System.out.print("Digite a quantidade de litros: ");

            double litros = scanner.nextInt();

            double precoLitro = 0;
            double percentualDesconto = 0;
            String combustivel = "";

            if (litros <= 0) {
                System.out.println("Erro. Quantidade inválida.");
                return;
            }

            switch (escolha) {
                case 1 -> {
                    combustivel = "álcool";
                    precoLitro = PRECO_ALCOOL;
                    percentualDesconto = (litros <= 25) ? 2 : 4;
                }
                case 2 -> {
                    combustivel = "gasolina";
                    precoLitro = PRECO_GASOLINA;
                    percentualDesconto = (litros <= 25) ? 3 : 5;
                }
                default -> {
                    System.out.println("Erro. Opção inválida.");
                    return;
                }
            }

            double preco = precoLitro * litros;
            double desconto = preco * (percentualDesconto / 100);
            double total = preco - desconto;

            System.out.printf("Valor bruto: R$%.2f%n", preco);
            System.out.printf("Desconto aplicado: R$%.2f%n", desconto);
            System.out.printf("Total a pagar pelo %s: R$%.2f%n",
                    combustivel,
                    total);
        }
    }
}