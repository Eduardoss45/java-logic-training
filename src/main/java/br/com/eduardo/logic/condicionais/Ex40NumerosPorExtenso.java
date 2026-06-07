package br.com.eduardo.logic.condicionais;

// * 40. Escreva um programa que receba um numero inteiro de 1 a 100 e mostre na tela o numero por extenso.

import java.util.Scanner;

public class Ex40NumerosPorExtenso {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 100: ");
            int n = scanner.nextInt();

            if (n < 1 || n > 100) {
                System.out.printf("Erro. O número enviado não está no intervalo permitido.");
                return;
            }

            int de = (n % 100) / 10;
            int un = n % 10;

            String sufixo1 = "";
            String sufixo2 = "";

            switch (de) {
                case 1 -> {
                    if (n > 10 && n < 20) {
                        switch (n) {
                            case 11 -> {
                                sufixo1 = "onze";
                            }
                            case 12 -> {
                                sufixo1 = "doze";
                            }
                            case 13 -> {
                                sufixo1 = "treze";
                            }
                            case 14 -> {
                                sufixo1 = "quatorze";
                            }
                            case 15 -> {
                                sufixo1 = "quinze";
                            }
                            case 16 -> {
                                sufixo1 = "dezesseis";
                            }
                            case 17 -> {
                                sufixo1 = "dezessete";
                            }
                            case 18 -> {
                                sufixo1 = "dezoito";
                            }
                            case 19 -> {
                                sufixo1 = "dezenove";
                            }
                        }
                    } else {
                        sufixo1 = "dez";
                    }
                }
                case 2 -> {
                    sufixo1 = "vinte";
                }
                case 3 -> {
                    sufixo1 = "trinta";
                }
                case 4 -> {
                    sufixo1 = "quarenta";
                }
                case 5 -> {
                    sufixo1 = "cinquenta";
                }
                case 6 -> {
                    sufixo1 = "sessenta";
                }
                case 7 -> {
                    sufixo1 = "setenta";
                }
                case 8 -> {
                    sufixo1 = "oitenta";
                }
                case 9 -> {
                    sufixo1 = "noventa";
                }
            }

            switch (un) {
                case 1 -> {
                    sufixo2 = "um";
                }
                case 2 -> {
                    sufixo2 = "dois";
                }
                case 3 -> {
                    sufixo2 = "três";
                }
                case 4 -> {
                    sufixo2 = "quatro";
                }
                case 5 -> {
                    sufixo2 = "cinco";
                }
                case 6 -> {
                    sufixo2 = "seis";
                }
                case 7 -> {
                    sufixo2 = "sete";
                }
                case 8 -> {
                    sufixo2 = "oito";
                }
                case 9 -> {
                    sufixo2 = "nove";
                }
            }

            if (n == 100) {
                System.out.printf("O número %d é escrito como cem por extenso.", n);
            } else if (de < 1) {
                System.out.printf("O número %d é escrito como %s por extenso.", n, sufixo2);
            } else if (n % 10 == 0 || n > 10 && n < 20) {
                System.out.printf("O número %d é escrito como %s por extenso.", n, sufixo1);
            } else {
                System.out.printf("O número %d é escrito como %s e %s por extenso.", n, sufixo1, sufixo2);
            }
        }
    }
}
