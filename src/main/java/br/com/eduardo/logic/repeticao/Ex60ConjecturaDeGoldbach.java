package br.com.eduardo.logic.repeticao;

// * 60. A famosa conjectura de Goldbach diz que todo inteiro par maior que 2 é soma de dois números primos. Testes foram feitos, mas ainda não se achou um contra-exemplo. Escreva um programa mostrando que a afirmação é verdadeira para todo número par entre 500 e 1000. O programa deve imprimir o número par e os dois primos que somados dão o número par.

public class Ex60ConjecturaDeGoldbach {
    public static void main(String[] args) {
        for (int intervalo = 500; intervalo <= 1000; intervalo += 2) {
            for (int i = 2; i <= intervalo / 2; i++) {
                int complemento = intervalo - i;

                int divisores1 = 0;
                for (int j = 1; j <= complemento; j++) {
                    if (complemento % j == 0) {
                        divisores1++;
                    }
                }

                int divisores2 = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divisores2++;
                    }
                }

                if (divisores1 == 2 && divisores2 == 2) {
                    System.out.printf("x (%d) + y (%d) = %d%n", complemento, i, intervalo);
                    break;
                }
            }
        }
    }
}
