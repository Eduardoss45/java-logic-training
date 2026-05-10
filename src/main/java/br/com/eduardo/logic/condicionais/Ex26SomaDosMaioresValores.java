package br.com.eduardo.logic.condicionais;

// * 26. Escreva um programa que leia 3 valores e escreva a soma dos 2 maiores.

import java.util.Scanner;

public class Ex26SomaDosMaioresValores {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            System.out.print("Digite o terceiro número: ");
            int n3 = scanner.nextInt();

            int maiorNumero1;
            int maiorNumero2;

            if (n1 >= n2 && n1 >= n3) {
                maiorNumero1 = n1;
                if (n2 >= n3) {
                    maiorNumero2 = n2;
                } else {
                    maiorNumero2 = n3;
                }
            } else if (n2 >= n1 && n2 >= n3) {
                maiorNumero1 = n2;
                if (n1 >= n3) {
                    maiorNumero2 = n1;
                } else {
                    maiorNumero2 = n3;
                }
            } else {
                maiorNumero1 = n3;
                if (n1 >= n2) {
                    maiorNumero2 = n1;
                } else {
                    maiorNumero2 = n2;
                }
            }

            int res = maiorNumero1 + maiorNumero2;

            System.out.printf("Os maiores números são %d e %d e a soma desses dois valores é %d", maiorNumero1,
                    maiorNumero2, res);
        }
    }
}
