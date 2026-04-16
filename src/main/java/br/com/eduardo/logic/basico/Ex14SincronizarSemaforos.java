package br.com.eduardo.logic.basico;

// * 14.  Em uma cidade se deseja sincronizar os semáforos. Com isto, quando um semáforo abre (fica verde), os veículos que nele estavam parados tendem a encontrar os próximos semáforos também abertos. Para que isto seja feito, os próximos semáforos precisam abrir um pouco depois, dependendo da velocidade permitida na via e da distância entre eles. Assim, ao abrir o semáforo, um veículo começa a acelerar até atingir a velocidade permitida, que mantém até chegar ao próximo semáforo, levando um certo tempo para percorrer essa distância. Para que encontre o próximo semáforo aberto, este deve abrir um pouco antes da chegada do veículo (por exemplo: 3 segundos antes). Faça assim um algoritmo que informe quanto tempo depois um semáforo deve abrir, dada as seguintes informações:

// * a. A distância desde o semáforo anterior
// * b. A velocidade permitida da via 
// * c. A aceleração típica dos carros

import java.util.Scanner;

public class Ex14SincronizarSemaforos {
    public static void main(String[] args) {
        final double FATOR_CONVERSAO = 3.6;
        final double ACELERACAO_MEDIA = 6.75;
        final int[] VELOCIDADES_PERMITIDAS = { 80, 60, 40, 30 };
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite a distância entre os semáforos (em metros): ");
            double distancia = scanner.nextDouble();

            System.out.println("Escolha a velocidade permitida:");
            System.out.println("1 - 80 km/h");
            System.out.println("2 - 60 km/h");
            System.out.println("3 - 40 km/h");
            System.out.println("4 - 30 km/h");
            System.out.print("Opção: ");
            int escolha = scanner.nextInt();

            if (distancia <= 0) {
                System.out.println("A distância deve ser maior que zero.");
                return;
            }

            if (escolha < 1 || escolha > 4) {
                System.out.println("Erro. Opção inválida.");
                return;
            }

            double velocidade = VELOCIDADES_PERMITIDAS[escolha - 1] / FATOR_CONVERSAO;
            double aceleracao = ACELERACAO_MEDIA;

            double tempoTotal;

            double tempoAceleracao = velocidade / aceleracao;
            double distanciaAceleracao = 0.5 * aceleracao * Math.pow(tempoAceleracao, 2);

            if (distancia <= distanciaAceleracao) {
                tempoTotal = Math.sqrt((2 * distancia) / aceleracao);
            } else {
                double distanciaConstante = distancia - distanciaAceleracao;
                double tempoConstante = (distanciaConstante / velocidade);
                tempoTotal = tempoAceleracao + tempoConstante;
            }

            double tempoSemaforo = tempoTotal - 3;

            System.out.printf("O tempo necessário é de %.2f segundos.", tempoSemaforo);
        }
    }
}
