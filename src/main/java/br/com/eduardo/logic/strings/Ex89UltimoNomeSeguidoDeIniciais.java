package br.com.eduardo.logic.strings;

import java.util.Scanner;

// * 89. Escreva um programa em Java, que gere uma string composta pelo último nome, seguido de virgula e as iniciais dos demais nomes (em ordem), seguida de ponto. Por exemplo, se a string entrada for “Gabriel Garcia Marquez”, a string gerada deve ser “Marquez,G.G.”.

public class Ex89UltimoNomeSeguidoDeIniciais {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome completo: ");
            String text = scanner.nextLine();
            String[] name = text.split(" ");

            String abbreviatedName = "";

            abbreviatedName += name[name.length - 1] + ",";

            for (int i = 0; i < name.length - 1; i++) {
                if (i < name.length - 2) {
                    abbreviatedName += name[i].charAt(0) + ".";
                } else {
                    abbreviatedName += name[i].charAt(0);
                }
            }

            System.out.printf("O nome \"%s\" abreviado ficou \"%s\"", text, abbreviatedName);
        }
    }
}
