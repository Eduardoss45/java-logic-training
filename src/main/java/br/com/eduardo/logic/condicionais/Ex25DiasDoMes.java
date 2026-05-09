package br.com.eduardo.logic.condicionais;

// * 25. Escreva um programa que leia o número equivalente ao mês e imprima a quantidade de dias deste mês.

import java.util.Scanner;

public class Ex25DiasDoMes {
    public static void main(String[] args) {
        int[] diasPorMes = {
                31,
                28,
                31,
                30,
                31,
                30,
                31,
                31,
                30,
                31,
                30,
                31
        };

        String[] nomesMeses = {
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro"
        };

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número do mês: ");
            int numero = scanner.nextInt();

            int dias;
            String mes;

            if (numero >= 1 && numero <= 12) {
                mes = nomesMeses[numero - 1];
                dias = diasPorMes[numero - 1];

                System.out.printf("O mês de %s tem um total de %d dias.", mes, dias);
            } else {
                System.out.print("Erro. O número deve estar no intervalo de 1 a 12.");
            }
        }
    }
}
