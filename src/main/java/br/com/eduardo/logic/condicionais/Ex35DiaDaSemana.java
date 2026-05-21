package br.com.eduardo.logic.condicionais;

// * 35. Escreva um programa que leia um número inteiro de 1 a 7 e informe o dia da semana correspondente, sendo domingo o dia de número 1. Se o número não corresponder a um dia da semana, mostre uma mensagem de erro.

import java.util.Scanner;

public class Ex35DiaDaSemana {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 7: ");

            int dia = scanner.nextInt();
            switch (dia) {
                case 1 -> {
                    System.out.println("Domingo");
                }
                case 2 -> {
                    System.out.println("Segunda-feira");
                }
                case 3 -> {
                    System.out.println("Terça-feira");
                }
                case 4 -> {
                    System.out.println("Quarta-feira");
                }
                case 5 -> {
                    System.out.println("Quinta-feira");
                }
                case 6 -> {
                    System.out.println("Sexta-feira");
                }
                case 7 -> {
                    System.out.println("Sábado");
                }
                default -> {
                    System.out.println("Erro. O número deve estar entre 1 e 7.");
                }
            }
        }
    }
}
