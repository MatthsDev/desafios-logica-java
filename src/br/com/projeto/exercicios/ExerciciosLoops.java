package br.com.projeto.exercicios;

import java.util.Scanner;

public class ExerciciosLoops {

    public static void tabuada(Scanner sc) {
        System.out.print("Número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void contarAte100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void somarLista(Scanner sc) {
        System.out.print("Quantos números deseja somar? ");
        int qtd = sc.nextInt();

        int soma = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            soma += sc.nextInt();
        }

        System.out.println("Soma total: " + soma);
    }

    public static void imprimirPares() {
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}
