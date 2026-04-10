package Aula01.Q03;

public class Main {
    public static void main(String[] args) {
        double nota1 = 80;
        double nota2 = 60;
        double nota3 = 70;

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);

        if (media >= 70) {
            System.out.println("Aprovado!");
        } else if (media < 40) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Final!");
        }
    }
}