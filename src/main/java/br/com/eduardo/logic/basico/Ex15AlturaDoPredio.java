package br.com.eduardo.logic.basico;

// * 15. Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é suficientemente longa. Assumindo que seja possível medir sua sombra e a do prédio no chão, e que você lembre da sua altura, faça um programa para ler os dados necessários e calcular a altura do prédio.

import java.util.Scanner;

public class Ex15AlturaDoPredio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite sua altura em metros: ");
            double alturaPessoa = scanner.nextDouble();
            System.out.print("Digite a medida da sua sombra no chão em metros: ");
            double alturaSombraPessoa = scanner.nextDouble();
            System.out.print("Digite a medida da sombra do prédio em metros: ");
            double alturaSombraPredio = scanner.nextDouble();

            if (alturaPessoa <= 0 || alturaSombraPessoa <= 0 || alturaSombraPredio <= 0) {
                System.out.println("Erro. Todas as medidas devem ser maiores que zero.");
            } else {
                double alturaPredio = (alturaSombraPredio / alturaSombraPessoa) * alturaPessoa;
                System.out.printf("O prédio mede aproximadamente %.2f metros.", alturaPredio);
            }
        }
    }
}
