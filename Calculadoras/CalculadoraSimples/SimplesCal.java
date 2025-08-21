package Calculadoras.CalculadoraSimples;

import java.util.Scanner;

public class SimplesCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero01;
        double numero02;
        String operacao;
        String continuar;

        System.out.println("Bem-vindo(a) a calculadora do Soa");

        do {
            System.out.printf("Informe o primeiro número: ");
            numero01 = sc.nextDouble();
            System.out.printf("Informe o segundo número: ");
            numero02 = sc.nextDouble();
            System.out.printf("Informe o tipo de operação que voc deseja aplicar: (+, -, *, /)");
            operacao = sc.next();

            switch (operacao) {
                case "+": {
                    double soma = numero01 + numero02;
                    System.out.printf("Soma: %.2f%n", soma);
                }
                break;
                case "-": {
                    double subtracao = numero01 - numero02;
                    System.out.printf("subtraçao: %.2f%n", subtracao);
                }
                break;
                case "*": {
                    double multiplicacao = numero01 * numero02;
                    System.out.printf("multiplicação: %.2f%n", multiplicacao);
                }
                break;
                case "/": {
                    if (numero02 == 0) {
                        System.out.printf("Erro: Não é possivel realizar a divisão por zero.%n");
                    } else {
                        double divisao = numero01 / numero02;
                        System.out.printf("divisão: %.2f%n", divisao);
                    }
                }
                break;
            }
            System.out.printf("Deseja realizar outro cálculo? (Sim/Não)");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("Sim"));
        {
            System.out.printf("Encerrando a calculadora...");
        }
        sc.close();


    }
}
