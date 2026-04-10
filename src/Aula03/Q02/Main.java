package Aula03.Q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 70) {
            System.out.println(nome + " está Aprovado!");
        } else if (media < 40) {
            System.out.println(nome + " está Reprovado!");
        } else {
            System.out.println(nome + " está na Final!");
        }

        sc.close();
    }
}
