package br.com.eduardo.logic.basico;

// * 11. Faça um algoritmo para calcular a nota semestral de um aluno. A nota semestral é obtida pela média aritmética entre a nota de 2 bimestres. Cada nota de bimestre é composta por 2 notas de provas.

import java.util.Scanner;

public class Ex11NotaSemestral {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite as notas do primeiro bimestre.");
            System.out.print("Primeira prova: ");
            double n1 = scanner.nextDouble();
            System.out.print("Segunda prova: ");
            double n2 = scanner.nextDouble();
            System.out.println("Digite as notas do segundo bimestre.");
            System.out.print("Terceira prova: ");
            double n3 = scanner.nextDouble();
            System.out.print("Quarta prova: ");
            double n4 = scanner.nextDouble();
            if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10 && n3 >= 0 && n3 <= 10 && n4 >= 0 && n4 <= 10) {
                double m1 = (n1 + n2) / 2;
                double m2 = (n3 + n4) / 2;
                double mf = (m1 + m2) / 2;

                System.out.printf("A média do semestral é: %.2f", mf);
            } else {
                System.out.println("Erro. Todas as notas devem estar num intervalo de 1 a 10.");
            }
        }
    }
}
