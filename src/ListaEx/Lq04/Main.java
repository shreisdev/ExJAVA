package ListaEx.Lq04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Filme filme = null;
        int opcao;


        do {
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Avaliar filme");
            System.out.println("3 - Exibir média de avaliações");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    filme = new Filme();
                    System.out.print("Digite o nome do filme: ");
                    filme.setNome(sc.nextLine());
                    System.out.print("Digite o gênero do filme: ");
                    filme.setGenero(sc.nextLine());
                    System.out.print("Digite o ano do filme: ");
                    filme.setAno(sc.nextInt());
                    System.out.print("Digite a duração do filme (em minutos): ");
                    filme.setDuracao(sc.nextInt());
                    break;

                case 2:
                    if (filme == null) {
                        System.out.println("Nenhum filme cadastrado. Por favor, cadastre um filme primeiro.");
                    } else {
                        System.out.print("Digite a nota para o filme (0 a 10): ");
                        double nota = sc.nextDouble();
                        if (nota < 0 || nota > 10) {
                            System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
                        } else {
                            filme.setSomaNotas(filme.getSomaNotas() + nota);
                            filme.setQtdAvaliacoes(filme.getQtdAvaliacoes() + 1);
                        }
                    }
                    break;
                case 3:
                    if (filme == null) {
                        System.out.println("Nenhum filme cadastrado. Por favor, cadastre um filme primeiro.");
                    } else if (filme.getQtdAvaliacoes() == 0) {
                        System.out.println("Nenhuma avaliação registrada para este filme.");
                    } else {
                        double media = filme.getSomaNotas() / filme.getQtdAvaliacoes();
                        System.out.printf("Média de avaliações para '%s': %.2f%n", filme.getNome(), media);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (opcao != 4);
    }

}