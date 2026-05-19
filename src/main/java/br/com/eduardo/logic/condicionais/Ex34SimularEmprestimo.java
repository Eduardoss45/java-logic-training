package br.com.eduardo.logic.condicionais;

// * 34. Uma financeira usa o seguinte critério para conceder empréstimos: o valor total do empréstimo deve ser até dez vezes o valor da renda mensal do solicitante e o valor da prestação deve ser no máximo 30% da renda mensal do solicitante. Escreva um programa que leia a renda mensal de um solicitante, o valor total do empréstimo solicitado e o número de prestações que o solicitante deseja pagar e informe se o empréstimo pode ou não ser concedido.

import java.util.Scanner;

public class Ex34SimularEmprestimo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor da sua renda R$");
            double salario = scanner.nextDouble();

            if (salario <= 0) {
                System.out.println("Erro o empréstimo não pode ser realizado. O valor da renda recebida é inválido.");
                return;
            }

            System.out.print("Digite o valor do emprestimo solicitado R$");
            double emprestimo = scanner.nextDouble();

            if ((salario * 10) < emprestimo) {
                System.out.println("O valor do empréstimo está acima da margem salarial do cliente.");
                return;
            }

            double valorMaximoPrestacao = salario * 30 / 100;
            int prestacoesMinimas = (int) Math.ceil(emprestimo / valorMaximoPrestacao);

            System.out.printf(
                    "Digite o número de prestações para pagar o empréstimo. Com base na sua renda recomendamos o número mínimo de %d prestações: ",
                    prestacoesMinimas);
            int numeroPrestacoes = scanner.nextInt();

            if (numeroPrestacoes <= 0) {
                System.out.println(
                        "Erro o empréstimo não pode ser realizado. O número de parcelas solicitado é inválido.");
                return;
            }

            double valorPrestacao = emprestimo / numeroPrestacoes;

            if (valorPrestacao > valorMaximoPrestacao) {
                System.out.printf(
                        "Erro o empréstimo não pode ser realizado. O valor da parcela excede o valor máximo da renda mensal. O valor não deve ser superior a R$%.2f.",
                        valorMaximoPrestacao);
                return;
            }

            System.out.println("Todos os requisitos para o empréstimo foram atingidos.");
            System.out.printf("Valor: R$%.2f%n", emprestimo);
            System.out.printf("Parcelas: %d%n", numeroPrestacoes);
            System.out.printf("Valor das prestações: R$%.2f%n", valorPrestacao);
        }
    }
}
