package br.com.eduardo.logic.vetores;

import java.util.Arrays;

//* 73. Escreva um programa em Java que leia um array de 20 inteiros, calcule e imprima: a - A moda dos elementos no array (elemento mais frequente). b - A mediana dos elementos no array (elemento central) c - A média;

public class Ex73MediaMedianaEModaDoVetor {
    public static void main(String[] args) {
        int[] vetor = { 16, 11, 6, 2, 17, 8, 2, 19, 18, 1, 2, 2, 15, 14, 17, 21, 24, 7, 4, 10 };

        int soma = 0;
        int freq = 0;
        int moda = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            int count = 0;

            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    count++;
                }

            }

            if (count > freq) {
                freq = count;
                moda = vetor[i];
            }
        }

        double media = (double) soma / vetor.length;

        Arrays.sort(vetor); // ! isto deve ser feito no loop

        double mediana = (vetor[9] + vetor[10]) / 2.0;

        System.out.printf("A média é %.2f. A mediana é %.2f e a moda é %d.", media, mediana, moda);
    }
}
