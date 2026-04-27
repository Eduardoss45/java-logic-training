package br.com.eduardo.logic.basico;

// * 20. Uma loja vende seus produtos no sistema entrada mais duas prestações, sendo a entrada maior do que ou igual às duas prestações, as quais devem ser iguais, inteiras e as maiores possíveis. Por exemplo, se o valor da mercadoria for R$ 270,00, a entrada e as duas prestações são iguais a R$ 90,00; se o valor da mercadoria for R$ 302,75, a entrada é de R$ 102,75 e as duas prestações são a iguais a R$ 100,00. Escreva um programa que receba o valor da mercadoria e forneça o valor da entrada e das duas prestações, de acordo com as regras acima.Observe que uma justificativa para a adoção desta regra é que ela facilita a confecção e o consequente pagamento dos boletos das duas prestações

import java.util.Scanner;

public class Ex20EntradaEDuasParcelas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                System.out.println("Erro, valor impossivel de parcelar");
                return;
            }

            int prestacao = (int) (valor / 3);
            double entrada = valor - (prestacao * 2);

            System.out.printf("Entrada: R$ %.2f\n", entrada);
            System.out.printf("Prestação 1: R$ %d\n", prestacao);
            System.out.printf("Prestação 2: R$ %d\n", prestacao);
        }
    }
}
