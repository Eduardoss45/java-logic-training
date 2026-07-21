package br.com.eduardo.logic.vetores;

// * 68. Escreva um programa que leia o índice pluviométrico de cada dia do mês de junho e informe o dia que mais choveu, o dia que menos choveu e as médias pluviométricas de cada uma das duas quinzenas.

public class Ex68CalculoPluviometrico {
    public static void main(String[] args) {
        double[] vetor = {
                0.0, 0.0, 3.2, 0.0, 0.0, 0.0, 0.0, 1.5, 0.0, 0.0,
                0.0, 0.0, 0.0, 8.7, 2.1, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 4.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 0.0
        };

        double max = vetor[0];
        double min = vetor[0];

        int pluvMax = 1;
        int pluvMin = 1;

        double med1 = 0;
        double med2 = 0;

        double soma1 = 0;
        double soma2 = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
                pluvMax = i + 1;
            } else if (vetor[i] < min) {
                min = vetor[i];
                pluvMin = i + 1;
            }

            if (i <= 14) {
                soma1 += vetor[i];
            } else {
                soma2 += vetor[i];
            }
        }

        med1 = soma1 / 15;
        med2 = soma2 / 15;

        System.out.printf(
                "O mês de junho teve o maior dia pluviométrico em %d e o menor em %d. A média da primeira quinzena é de %.2f e a da segunda é de %.2f.",
                pluvMax, pluvMin, med1, med2);
    }
}
