package ListaEx.Lq01;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a matrícula do funcionário: ");
        int matricula = sc.nextInt();

        System.out.print("Digite o nome do funcionário: ");
        sc.nextLine();
        String name = sc.nextLine();


        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();

        double extra = 1000;


        folha folha = new folha(matricula, name, salario);


        folha.setSalario(folha.getSalario() + extra);






        System.out.println("--- Contracheque ---");

        System.out.printf("Extra: R$ %.2f", extra);



        folha.exibirContracheque();









        sc.close();
    }
}