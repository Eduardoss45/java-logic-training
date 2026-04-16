package br.com.eduardo.logic.basico;

// * 13. Um circuito elétrico é composto de duas resistências R1 e R2 em paralelo, e ambas em sequência de uma resistência R3.Faça um algoritmo para calcular a resistência equivalente desse circuito.

import java.util.Scanner;

public class Ex13ResistenciaDeCircuito {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor da primeira resistência em Ohms: ");
            double r1 = scanner.nextDouble();
            System.out.print("Digite o valor da segunda resistência em Ohms: ");
            double r2 = scanner.nextDouble();
            System.out.print("Digite o valor da terceira resistência em Ohms: ");
            double r3 = scanner.nextDouble();
            if (r1 > 0 && r2 > 0 && r3 >= 0) {
                double resistenciaParalela = (r1 * r2) / (r1 + r2);
                double resistenciaEquivalente = r3 + resistenciaParalela;
                System.out.printf("A resistência do circuito é de %.2f Ohms", resistenciaEquivalente);
            } else {
                System.out.println(
                        "Erro. As resistências R1 e R2 devem ser maiores que zero, e R3 não pode ser negativa.");
            }
        }
    }
}
