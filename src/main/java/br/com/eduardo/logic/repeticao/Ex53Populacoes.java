package br.com.eduardo.logic.repeticao;

// * 53. Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, e um país B com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano, escreva um programa, que imprima o tempo necessário para que a população do país A ultrapasse a população do país B.

public class Ex53Populacoes {
    public static void main(String[] args) {
        int populacaoA = 5000000;
        int populacaoB = 7000000;
        int years = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * 0.03;
            populacaoB += populacaoB * 0.02;
            years++;
        }

        System.out.printf("Para que a população do país A alcance a população do país B, serão necessários %d anos.",
                years);
    }
}
