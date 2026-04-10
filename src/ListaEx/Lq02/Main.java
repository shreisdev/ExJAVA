package ListaEx.Lq02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria(12345, "Sérgio Henry", 1000.00);
        ContaBancaria conta2 = new ContaBancaria(67890, "Ryanna Reis", 500.00);

        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta1.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double valorDeposito = sc.nextDouble();
                    conta1.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double valorSaque = sc.nextDouble();
                    conta1.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        sc.close();
    }
}
