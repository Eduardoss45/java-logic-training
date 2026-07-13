package br.com.eduardo.logic.vetores;

// * 61.  Faça um programa para criar e inicializar um array de 20 posições de inteiros com 0 para cada elemento. Imprima o vetor em seguida, indicando a posição e o valor na posição (um por linha).

public class Ex61Vetor {
    public static void main(String[] args) {
        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
            System.out.printf("Posição (%d), Valor: (%d)%n", i, vetor[i]);
        }
    }
}
