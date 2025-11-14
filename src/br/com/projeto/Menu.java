package br.com.projeto;
import java.util.Scanner;

    public class Menu {

        public static void exibirMenu() {
            System.out.println("""
                =============================================================
                                 PROJETO DE LÓGICA JAVA
                =============================================================

                🔷 VARIÁVEIS E OPERAÇÕES           🔷 CONDICIONAIS
                1  - Somar dois números            5  - Par ou Ímpar
                2  - Calcular média                6  - Maior de idade
                3  - Celsius ↔ Fahrenheit          7  - Tipo de número
                4  - Calcular idade                8  - Calculadora simples

                🔷 LOOPS                            🔷 FUNÇÕES
                9  - Tabuada                       13 - Função soma
                10 - Contar 1 a 100                14 - Maior número
                11 - Somar lista                   15 - Inverter string
                12 - Pares até 50                  16 - Contar vogais

                =============================================================
                Escolha uma opção:
                """);
        }

        public static int lerOpcao(Scanner scanner) {
            System.out.print("→ ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite uma opção válida: ");
                scanner.next();
            }
            return scanner.nextInt();
        }
    }



