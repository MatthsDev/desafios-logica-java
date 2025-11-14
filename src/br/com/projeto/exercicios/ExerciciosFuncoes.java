package br.com.projeto.exercicios;

import java.util.Scanner;

public class ExerciciosFuncoes {

    public static void somar(Scanner sc) {
        System.out.print("A: ");
        double a = sc.nextDouble();

        System.out.print("B: ");
        double b = sc.nextDouble();

        System.out.println("Resultado: " + (a + b));
    }

    public static void maiorNumero(Scanner sc) {
        System.out.print("A: ");
        double a = sc.nextDouble();

        System.out.print("B: ");
        double b = sc.nextDouble();

        System.out.println("Maior: " + Math.max(a, b));
    }

    public static void inverterString(Scanner sc) {
        System.out.print("Texto: ");
        sc.nextLine(); // limpar buffer
        String texto = sc.nextLine();

        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println("Invertido: " + invertido);
    }

    public static void contarVogais(Scanner sc) {
        System.out.print("Texto: ");
        sc.nextLine(); // limpar buffer
        String texto = sc.nextLine().toLowerCase();

        int count = 0;
        for (char c : texto.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }

        System.out.println("Vogais: " + count);
    }
}
