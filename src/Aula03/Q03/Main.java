package Aula03.Q03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao != 0) {
                System.out.print("Digite o primeiro número: ");
                double n1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double n2 = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (n1 - n2));
                        break;
                    case 3:
                        if (n2 != 0) {
                            System.out.println("Resultado: " + (n1 / n2));
                        } else {
                            System.out.println("Erro! Divisão por zero.");
                        }
                        break;
                    case 4:
                        System.out.println("Resultado: " + (n1 * n2));
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        } while (opcao != 0);

        System.out.println("Encerrando...");
        sc.close();
    }
}
