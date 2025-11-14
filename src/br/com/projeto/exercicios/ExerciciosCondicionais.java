package br.com.projeto.exercicios;

import java.util.Scanner;

public class ExerciciosCondicionais {

    public static void parOuImpar(Scanner sc) {
        System.out.print("Número: ");
        int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? "Par" : "Ímpar");
    }

    public static void maiorIdade(Scanner sc) {
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade");
    }

    public static void tipoNumero(Scanner sc) {
        System.out.print("Número: ");
        int n = sc.nextInt();

        if (n > 0) System.out.println("Positivo");
        else if (n < 0) System.out.println("Negativo");
        else System.out.println("Zero");
    }

    public static void calculadora(Scanner sc) {
        System.out.print("A: ");
        double a = sc.nextDouble();

        System.out.print("B: ");
        double b = sc.nextDouble();

        System.out.println("""
                Operação:
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                """);

        int op = sc.nextInt();

        switch (op) {
            case 1 -> System.out.println("Resultado: " + (a + b));
            case 2 -> System.out.println("Resultado: " + (a - b));
            case 3 -> System.out.println("Resultado: " + (a * b));
            case 4 -> System.out.println("Resultado: " + (b != 0 ? a / b : "Erro! Divisão por zero"));
            default -> System.out.println("Opção inválida!");
        }
    }
}
