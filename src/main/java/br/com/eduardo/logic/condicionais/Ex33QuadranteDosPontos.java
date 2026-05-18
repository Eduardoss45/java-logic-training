package br.com.eduardo.logic.condicionais;

// * 33. Escreva um algoritmo que leia 2 valores (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x=y=0).

import java.util.Scanner;

public class Ex33QuadranteDosPontos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número representando o eixo x: ");
            double x = scanner.nextDouble();

            System.out.print("Digite o número representando o eixo y: ");
            double y = scanner.nextDouble();

            if (x > 0 && y > 0) {
                System.out.printf("(X:%.2f ,Y:%.2f) Primeiro quadrante.", x, y);
            } else if (x < 0 && y > 0) {
                System.out.printf("(X:%.2f ,Y:%.2f) Segundo quadrante.", x, y);
            } else if (x < 0 && y < 0) {
                System.out.printf("(X:%.2f ,Y:%.2f) Terceiro quadrante.", x, y);
            } else if (x > 0 && y < 0) {
                System.out.printf("(X:%.2f ,Y:%.2f) Quarto quadrante.", x, y);
            } else if (x == 0 && y == 0) {
                System.out.println("O ponto está na origem.");
            } else if (x == 0) {
                System.out.println("O ponto está sobre o eixo Y.");
            } else {
                System.out.println("O ponto está sobre o eixo X.");
            }
        }
    }
}