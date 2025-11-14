package br.com.projeto.exercicios;

import java.util.Scanner;

public class ExerciciosVariaveis {

    public static void somarNumeros(Scanner sc) {
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        System.out.println("Resultado: " + (a + b));
    }

    public static void calcularMedia(Scanner sc) {
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.println("Média: " + ((n1 + n2) / 2));
    }

    public static void converterTemperatura(Scanner sc) {
        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();

        System.out.println("""
                Converter:
                1 - Celsius para Fahrenheit
                2 - Fahrenheit para Celsius
                """);

        System.out.print("→ ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Resultado: " + ((temp * 9/5) + 32) + " °F");
        } else if (opcao == 2) {
            System.out.println("Resultado: " + ((temp - 32) * 5/9) + " °C");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void calcularIdade(Scanner sc) {
        System.out.print("Ano de nascimento: ");
        int ano = sc.nextInt();

        int idade = 2025 - ano;
        System.out.println("Idade: " + idade + " anos");
    }
}
