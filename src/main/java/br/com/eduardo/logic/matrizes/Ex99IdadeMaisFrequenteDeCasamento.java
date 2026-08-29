package br.com.eduardo.logic.matrizes;

import java.util.Scanner;

// * 99. Escrever um algoritmo e implementá-lo em linguagem Java que dada uma matriz N X N, contendo, em cada linha, as idades do homem e da mulher no casamento, criar uma matriz de freqüência de idade de casamento, com as contagens para cada combinação de idades. As idades variam de 18 até 30. Os pares de idade devem ser lidos até que se informe um valor inválido para a idade de qualquer dos dois nubentes. Em seguida, o programa deverá informar: (1) Qual a idade mais freqüente de casamento dos homens (2) Qual a idade mais freqüente de casamento das mulheres (3) Qual a combinação mais freqüente de idades de casamento

public class Ex99IdadeMaisFrequenteDeCasamento {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] frequencia = new int[13][13];

            int maiorFrequenciaHomem = 0;
            int idadeHomemMaisFrequente = 0;

            int maiorFrequenciaMulher = 0;
            int idadeMulherMaisFrequente = 0;

            int maiorCombinacao = 0;
            int idadeHomemCombinacao = 0;
            int idadeMulherCombinacao = 0;

            while (true) {
                System.out.print("Digite a idade do homem: ");
                int homem = scanner.nextInt();

                System.out.print("Digite a idade da mulher: ");
                int mulher = scanner.nextInt();

                if (homem < 18 || homem > 30 || mulher < 18 || mulher > 30) {
                    break;
                }

                frequencia[homem - 18][mulher - 18]++;
            }

            for (int i = 0; i < frequencia.length; i++) {
                int soma = 0;

                for (int j = 0; j < frequencia[i].length; j++) {
                    soma += frequencia[i][j];
                }

                if (soma > maiorFrequenciaHomem) {
                    maiorFrequenciaHomem = soma;
                    idadeHomemMaisFrequente = i + 18;
                }

            }

            System.out.println(
                    "Idade masculina mais frequente: " + idadeHomemMaisFrequente);

            for (int i = 0; i < frequencia.length; i++) {
                int soma = 0;

                for (int j = 0; j < frequencia[i].length; j++) {
                    soma += frequencia[j][i];
                }

                if (soma > maiorFrequenciaMulher) {
                    maiorFrequenciaMulher = soma;
                    idadeMulherMaisFrequente = i + 18;
                }

            }

            System.out.println(
                    "Idade feminina mais frequente: " + idadeMulherMaisFrequente);

            for (int i = 0; i < frequencia.length; i++) {
                for (int j = 0; j < frequencia[i].length; j++) {

                    if (frequencia[i][j] > maiorCombinacao) {
                        maiorCombinacao = frequencia[i][j];
                        idadeHomemCombinacao = i + 18;
                        idadeMulherCombinacao = j + 18;
                    }
                }
            }

            System.out.println(
                    "Combinação mais frequente: homem de "
                            + idadeHomemCombinacao
                            + " anos e mulher de "
                            + idadeMulherCombinacao
                            + " anos ("
                            + maiorCombinacao
                            + " ocorrências).");
        }
    }
}
