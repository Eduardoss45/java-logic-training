package br.com.eduardo.logic.condicionais;

// * 39. (PROCURAR NA LISTA)

import java.util.Scanner;

public class Ex39CodigoDV {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número (4 digitos) da agência: ");
            int n = scanner.nextInt();

            if (n < 1000 || n > 9999) {
                System.out.println("Erro. O número da agência deve ter apenas 4 digitos.");
                return;
            }

            int mi = n / 1000;
            int ce = (n % 1000) / 100;
            int de = (n % 100) / 10;
            int un = n % 10;

            int soma = (mi * 5) + (ce * 4) + (de * 3) + (un * 2);

            int resto = soma % 11;
            int dv = 11 - resto;

            if (dv == 10) {
                System.out.printf("O código com o DV é %d-X", n);
            } else if (dv == 11) {
                System.out.printf("O código com o DV é %d-0", n);
            } else {
                System.out.printf("O código com o DV é %d-%d", n, dv);
            }
        }
    }
}
