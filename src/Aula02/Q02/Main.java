package Aula02.Q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome completo: ");
        String nome = sc.nextLine();
        System.out.print("Salário bruto: R$ ");
        double salarioBruto = sc.nextDouble();

        double inss = salarioBruto * 0.15;
        double salarioLiquido = salarioBruto - inss;

        System.out.println("\n--- Contracheque ---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Dedução INSS: R$ %.2f%n", inss);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}