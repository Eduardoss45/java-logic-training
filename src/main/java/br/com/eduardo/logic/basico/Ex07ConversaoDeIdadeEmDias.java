package br.com.eduardo.logic.basico;

// * 7. Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos, meses e dias.

import java.util.Scanner;

public class Ex07ConversaoDeIdadeEmDias {
    public static void main(String[] args) {
        final int DIAS_POR_ANO = 365;
        final int DIAS_POR_MES = 30;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite sua idade em dias: ");
            int idadeEmDias = scanner.nextInt();
            if (idadeEmDias <= 0) {
                System.out.println("Não é possível calcular idade com a quantidade de dias menor ou igual a zero.");
            } else {
                int anos = idadeEmDias / DIAS_POR_ANO;
                int restoDias = idadeEmDias % DIAS_POR_ANO;
                int meses = restoDias / DIAS_POR_MES;
                int dias = restoDias % DIAS_POR_MES;
                System.out.printf("A sua idade é de %d anos, %d meses e %d dias.%n",
                        anos, meses, dias);
            }
        }
    }
}
