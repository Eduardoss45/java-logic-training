package br.com.eduardo.logic.condicionais;

// * 37. Uma cia de pulverização utiliza avião para pulverizar lavouras. Os custos de pulverização dependem do tipo de praga e da área a ser contratada conforme a tabela: Tipo 1 – ervas daninhas R$ 50,00 por acre; Tipo 2 – gafanhotos R$ 100,00 por acre; Tipo 3 – broca R$ 150,00 por acre; Tipo 4 – todos acima R$ 250,00 por acre. Se a área a ser pulverizada for superior a 1000 acres, o fazendeiro tem um desconto de 5%. Em adição, qualquer fazendeiro cujo custo for maior do que R$ 750,00 tem um desconto de 10% sobre o valor que ultrapassar os R$ 750,00. Caso ambos os descontos se aplicam o da área é calculado antes. Fazer um algoritmo que leia: o tipo de pulverização (1 a 4) e área a ser pulverizada; e imprima o valor a ser pago.

import java.util.Scanner;

public class Ex37ServicoDePulverizacao {
    public static void main(String[] args) {
        final double PRICE_TYPE_1 = 50.00;
        final double PRICE_TYPE_2 = 100.00;
        final double PRICE_TYPE_3 = 150.00;
        final double PRICE_TYPE_4 = 250.00;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Tabela de serviços de pulverização:");
            System.out.println("Tipo [1] - ervas daninhas R$ 50,00 por acre.");
            System.out.println("Tipo [2] - gafanhotos R$ 100,00 por acre.");
            System.out.println("Tipo [3] - broca R$ 150,00 por acre.");
            System.out.println("Tipo [4] - todos acima R$ 250,00 por acre.");
            System.out.print("Escolha um serviço de pulverização representado pelos valores de 1 a 4: ");
            int value = scanner.nextInt();

            if (value <= 0 || value >= 5) {
                System.out.println("Erro. O serviço de pulverização selecionado é inválido.");
                return;
            }

            System.out.print("Digite o tamanho da área em acres: ");
            double acres = scanner.nextDouble();

            if (acres <= 0) {
                System.out.println("O tamanho da área deve ser maior que zero.");
                return;
            }

            double price = 0;
            double discount = 0;
            double totalDiscount = 0;

            switch (value) {
                case 1 -> {
                    price = acres * PRICE_TYPE_1;
                }
                case 2 -> {
                    price = acres * PRICE_TYPE_2;
                }
                case 3 -> {
                    price = acres * PRICE_TYPE_3;
                }
                case 4 -> {
                    price = acres * PRICE_TYPE_4;
                }
            }

            if (acres > 1000) {
                System.out
                        .println("A área é superior a 1000 acres. Portanto um desconto de 5% será aplicado.");
                discount = price * (5 / 100.0);
                price -= discount;
                totalDiscount += discount;
            }

            if (price > 750) {
                System.out
                        .println(
                                "O custo do serviço é superior a R$750. Portanto um desconto de 10% será aplicado.");
                double excedente = price - 750;
                discount = excedente * (10 / 100.0);
                price -= discount;
                totalDiscount += discount;
            }

            System.out.printf("O serviço selecionado foi o tipo %d.%n", value);
            System.out.printf("A área total é de %.2f acres.%n", acres);
            System.out.printf("O desconto aplicado foi de R$%.2f.%n", totalDiscount);
            System.out.printf("O valor do serviço ficou em R$%.2f.", price);
        }
    }
}
