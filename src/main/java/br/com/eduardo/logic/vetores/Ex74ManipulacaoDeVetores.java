package br.com.eduardo.logic.vetores;

import java.util.Scanner;

// * 74. Escreva um programa em Java que armazene um vetor de até 30 inteiros. O programa deve fornecer as seguintes operações: a - Inserir um elemento no final do vetor; b - Inserir um elemento em uma dada posição; c - Remover um elemento de uma posição indicada; d - Remover todos elementos iguais a um valor indicado; e - Gerar um novo array sem duplicidades a partir deste array

public class Ex74ManipulacaoDeVetores {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetor = new int[30];
            int quantity = 0;
            int option = -1;

            while (option != 0) {
                System.out.println("Escolha um tipo de manipulação para o vetor:");
                System.out.println("1 - Inserir um valor no final;");
                System.out.println("2 - Inserir um valor em uma posição;");
                System.out.println("3 - Remover posição;");
                System.out.println("4 - Remover valor;");
                System.out.println("5 - Remover duplicatas;");
                System.out.println("6 - Mostrar vetor;");
                System.out.println("0 - Sair.");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        System.out.println("Digite o valor: ");
                        int n = scanner.nextInt();

                        if (quantity >= vetor.length) {
                            System.out.println("Erro. O tamanho limite do vetor foi atingido.");
                            continue;
                        }

                        vetor[quantity] = n;
                        quantity++;
                    }
                    case 2 -> {
                        System.out.println("Digite o valor: ");
                        int n = scanner.nextInt();

                        System.out.println("Digite a posição (1 a 30): ");
                        int p = scanner.nextInt() - 1;

                        if (p < 0 || p > quantity) {
                            System.out.println("Erro. A posição solicitada não é permitida.");
                            continue;
                        }

                        if (quantity == vetor.length) {
                            System.out.println("Erro. Não existe mais espaço no vetor.");
                            break;
                        }

                        for (int i = quantity; i > p; i--) {
                            vetor[i] = vetor[i - 1];
                        }

                        vetor[p] = n;
                        quantity++;
                    }
                    case 3 -> {
                        System.out.println("Digite a posição (1 a 30) para remover um valor do vetor: ");
                        int p = scanner.nextInt() - 1;

                        if (quantity == 0) {
                            System.out.println("Erro. O vetor está vazio.");
                            continue;
                        }

                        if (p < 0 || p >= quantity) {
                            System.out.println("Erro. A posição solicitada não é permitida.");
                            continue;
                        }

                        for (int i = p; i < quantity - 1; i++) {
                            vetor[i] = vetor[i + 1];
                        }

                        quantity--;
                        vetor[quantity] = 0;
                    }
                    case 4 -> {
                        System.out.println("Digite um valor para remover do vetor: ");
                        int n = scanner.nextInt();

                        if (quantity == 0) {
                            System.out.println("Erro. O vetor está vazio.");
                            continue;
                        }

                        for (int i = 0; i < quantity; i++) {
                            if (vetor[i] == n) {
                                for (int j = i; j < quantity - 1; j++) {
                                    vetor[j] = vetor[j + 1];
                                }
                                quantity--;
                                vetor[quantity] = 0;
                                i--;
                            }
                        }

                    }
                    case 5 -> {
                        int[] newVetor = new int[30];
                        int newQuantity = 0;

                        for (int i = 0; i < quantity; i++) {
                            int v = vetor[i];
                            boolean valueInNewVetor = false;

                            for (int j = 0; j < newQuantity; j++) {
                                if (newVetor[j] == v) {
                                    valueInNewVetor = true;
                                    break;
                                }
                            }

                            if (valueInNewVetor == false) {
                                newVetor[newQuantity] = v;
                                newQuantity++;
                            }
                        }

                        vetor = newVetor;
                        quantity = newQuantity;
                    }
                    case 6 -> {
                        System.out.print("[");

                        for (int i = 0; i < quantity; i++) {
                            System.out.print(vetor[i]);

                            if (i < quantity - 1) {
                                System.out.print(", ");
                            }
                        }

                        System.out.println("]");
                    }
                    default -> {
                        break;
                    }
                }
            }
        }
    }
}
