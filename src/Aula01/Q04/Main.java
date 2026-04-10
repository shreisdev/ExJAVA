package Aula01.Q04;

public class Main {
    public static void main(String[] args) {
        double salario = 1800.00;
        double desconto = 0;
        String faixa = "";

        if (salario <= 900) {
            faixa = "Isento";
            desconto = 0;
        } else if (salario <= 1500) {
            faixa = "Desconto de 5%";
            desconto = salario * 0.05;
        } else if (salario <= 2500) {
            faixa = "Desconto de 10%";
            desconto = salario * 0.10;
        } else {
            faixa = "Desconto de 20%";
            desconto = salario * 0.20;
        }

        double salarioLiquido = salario - desconto;

        System.out.println("Salário bruto: R$ " + salario);
        System.out.println("IR: " + faixa);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}