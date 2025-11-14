package br.com.projeto;

import br.com.projeto.exercicios.*;
import java.util.Scanner;

public class AppController {

    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        while (true) {
            Menu.exibirMenu();
            int opcao = Menu.lerOpcao(scanner);

            if (opcao == 0) {
                System.out.println("\nPrograma finalizado. Até mais! 👋");
                scanner.close();
                return;
            }

            executarComRepeticao(opcao);
        }
    }

    private void executarComRepeticao(int opcao) {
        boolean repetir = true;

        while (repetir) {
            executarOpcao(opcao);

            System.out.println("""
                    
                    ==============================================
                    O que deseja fazer agora?
                    1 - Repetir essa mesma operação
                    2 - Voltar ao menu principal
                    0 - Sair do programa
                    ==============================================
                    """);

            System.out.print("→ ");

            int escolha;
            while (!scanner.hasNextInt()) {
                System.out.print("Digite uma opção válida: ");
                scanner.next();
            }
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> repetir = true;
                case 2 -> repetir = false;
                case 0 -> {
                    System.out.println("\nPrograma finalizado. Até mais! 👋");
                    System.exit(0);
                }
                default -> {
                    System.out.println("❌ Opção inválida! Voltando ao menu principal...");
                    repetir = false;
                }
            }
        }
    }

    private void executarOpcao(int opcao) {

        switch (opcao) {

            // Variáveis e Operações
            case 1 -> ExerciciosVariaveis.somarNumeros(scanner);
            case 2 -> ExerciciosVariaveis.calcularMedia(scanner);
            case 3 -> ExerciciosVariaveis.converterTemperatura(scanner);
            case 4 -> ExerciciosVariaveis.calcularIdade(scanner);

            // Condicionais
            case 5 -> ExerciciosCondicionais.parOuImpar(scanner);
            case 6 -> ExerciciosCondicionais.maiorIdade(scanner);
            case 7 -> ExerciciosCondicionais.tipoNumero(scanner);
            case 8 -> ExerciciosCondicionais.calculadora(scanner);

            // Loops
            case 9 -> ExerciciosLoops.tabuada(scanner);
            case 10 -> ExerciciosLoops.contarAte100();
            case 11 -> ExerciciosLoops.somarLista(scanner);
            case 12 -> ExerciciosLoops.imprimirPares();

            // Funções
            case 13 -> ExerciciosFuncoes.somar(scanner);
            case 14 -> ExerciciosFuncoes.maiorNumero(scanner);
            case 15 -> ExerciciosFuncoes.inverterString(scanner);
            case 16 -> ExerciciosFuncoes.contarVogais(scanner);

            default -> System.out.println("❌ Opção inválida!");
        }
    }
}
