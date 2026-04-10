package ListaEx.Lq03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Estoque produto = null;
        int opcao;

        do {
            System.out.println("\n=== CONTROLE DE ESTOQUE ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Exibir detalhes");
            System.out.println("3 - Calcular valor total do estoque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    produto = new Estoque(nome, preco, quantidade);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    if (produto != null) {
                        produto.exibirDetalhes();
                    } else {
                        System.out.println("Nenhum produto cadastrado!");
                    }
                    break;
                case 3:
                    if (produto != null) {
                        System.out.println("Valor total: R$ " + produto.calcularValorTotal());
                    } else {
                        System.out.println("Nenhum produto cadastrado!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);










    }
}
