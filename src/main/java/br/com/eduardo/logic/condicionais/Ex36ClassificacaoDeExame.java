package br.com.eduardo.logic.condicionais;

import java.util.Scanner;

// * 36. Em uma certificação são feitos são feitos 5 exames (I, II, III, IV e V). Escreva um programa que leia as notas destes exames e imprima a classificação do aluno, sabendo que a média é 70. Classificação: A – passou em todos os exames; B – passou em I, II e IV,mas não em III ou V; C – passou em I e II, III ou IV, mas não em V. Reprovado – outras situações.

public class Ex36ClassificacaoDeExame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Leitura de notas (0 a 100).");

            System.out.print("Digite a nota um: ");
            double n1 = scanner.nextDouble();

            System.out.print("Digite a nota dois: ");
            double n2 = scanner.nextDouble();

            System.out.print("Digite a nota três: ");
            double n3 = scanner.nextDouble();

            System.out.print("Digite a nota quatro: ");
            double n4 = scanner.nextDouble();

            System.out.print("Digite a nota cinco: ");
            double n5 = scanner.nextDouble();

            if (n1 < 0 || n1 > 100 || n2 < 0 || n2 > 100 || n3 < 0 || n3 > 100 || n4 < 0 || n4 > 100 || n5 < 0 || n5 > 100) {
                System.out.println("Erro. Todas as notas devem estar no intervalo de 0 a 100.");
                return;
            }

            boolean p1 = n1 >= 70;
            boolean p2 = n2 >= 70;
            boolean p3 = n3 >= 70;
            boolean p4 = n4 >= 70;
            boolean p5 = n5 >= 70;

            if (p1 && p2 && p3 && p4 && p5) {
                System.out.println("A – passou em todos os exames");
            } else if (p1 && p2 && p4 && (!p3 || !p5)) {
                System.out.println("B – passou em I, II e IV,mas não em III ou V");
            } else if (p1 && p2 && (p3 || p4) && !p5) {
                System.out.println("C – passou em I e II, III ou IV, mas não em V");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
