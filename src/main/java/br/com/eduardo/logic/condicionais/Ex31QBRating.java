package br.com.eduardo.logic.condicionais;

// * 31. No Futebol Americano, usa-se o Quarterback Rating como um índice que indica o desempenho do quarterback (quando maior,melhor). Ele é calculado como indicado a seguir: Calcula-se o percentual de passes completados em relação aos passes tentados pelo quarterback. Deste valor subtrai-se 0,3 e divide-se por 0,2. Este valor não deve ser maior que 2,375 ou menor que 0 (caso seja, ajusta-se o valor para 2,375 ou 0, respectivamente). Em seguida, calcula-se a razão de jardas passadas pela quantidade de passes tentados. Deste valor, subtrai-se 3 e divide-se por 4. Novamente, este valor não deve ser maior que 2,375 ou menor que 0 (caso seja, procede-se como no caso anterior). Agora,calcula-se a razão de passes para touchdows pelo número de passes tentados. Divide-se o valor por 0,05. Mais uma vez, este valor não deve ser maior que 2,375 ou menor que 0 (caso seja, procede-se como de costume). Então, calcula-se a razão entre passes interceptados e o número de passes tentados. Deste valor, subtrai-se 0,095 e divide-se o resultado por 0,04. Como de praxe, este valor não deve ser maior que 2,375 ou menor que 0 (caso seja,atua-se como explicado). O quarterback rating é calculando somando-se as quatro parcelas anteriores, multiplicando a soma por 100 e dividindo-se o produto por 6. Escreva um programa, que leia o número de passes tentados, o número de passes completos, o número de jardas passadas, o número de passes para touchdown e o número de passes interceptados e informe o QB Rating do quarterback.

import java.util.Scanner;

public class Ex31QBRating {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de tentativas de passes: ");
            int passesTentados = scanner.nextInt();

            if (passesTentados <= 0) {
                System.out.println("Erro. Os passes tentados devem ser um número positivo.");
                return;
            }

            System.out.printf("De %d passes, quantos foram recebidos? ", passesTentados);
            int passesCompletos = scanner.nextInt();

            if (passesCompletos < 0) {
                System.out.println("Erro. Os passes completos não podem ser um número menor que zero.");
                return;
            }

            if (passesCompletos > passesTentados) {
                System.out.println(
                        "Erro. A quantidade de passes completos não pode ser maior que a quantidade de passes tentados.");
                return;
            }

            System.out.print("Digite a quantidade de jardas atingidas no total: ");
            int jardasPassadas = scanner.nextInt();

            if (jardasPassadas < 0) {
                System.out.println("Erro. A quantidade de jardas deve ser maior ou igual a zero.");
                return;
            }

            System.out.print("Quantos passes resultaram em ponto? ");
            int passesTouchdown = scanner.nextInt();

            if (passesTouchdown < 0) {
                System.out.println("Erro. A quantidade de touchdowns deve ser um número positivo.");
                return;
            }

            if (passesTouchdown > passesTentados) {
                System.out.println("Erro. A quantidade de touchdowns não pode ser maior que a quantidade de passses tentados.");
                return;
            }

            System.out.print("Quantos passes foram roubados pelo time adversário: ");
            int passesInterceptados = scanner.nextInt();

            if (passesInterceptados < 0) {
                System.out.println("Erro. A quantidade de passes roubados deve ser um valor maior ou igual a zero.");
                return;
            }

            if (passesInterceptados > passesTentados) {
                System.out.println(
                        "Erro. A quantidade de passes interceptados deve ser menor que a quantidade de passses tentados.");
                return;
            }

            double a = (((double) passesCompletos / passesTentados) - 0.3) / 0.2;

            if (a < 0) {
                a = 0;
            } else if (a > 2.375) {
                a = 2.375;
            }

            double b = (((double) jardasPassadas / passesTentados) - 3) / 4;

            if (b < 0) {
                b = 0;
            } else if (b > 2.375) {
                b = 2.375;
            }

            double c = ((double) passesTouchdown / passesTentados) / 0.05;

            if (c < 0) {
                c = 0;
            } else if (c > 2.375) {
                c = 2.375;
            }

            double d = (0.095 - ((double) passesInterceptados / passesTentados)) / 0.04;

            if (d < 0) {
                d = 0;
            } else if (d > 2.375) {
                d = 2.375;
            }

            double rating = ((a + b + c + d) * 100) / 6;

            System.out.printf("QB Rating: %.2f%n", rating);
        }
    }
}
