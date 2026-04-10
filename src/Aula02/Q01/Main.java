package Aula02.Q01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

            System.out.print("Deseja fazer novo cadastro? (sim/não): ");
            resposta = sc.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Encerrando...");
        sc.close();
    }
}