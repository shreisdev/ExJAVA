package Aula05.Q02;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        Vendedor vendedor = new Vendedor("Maria");
        Pedido pedido = new Pedido("2x Camiseta Azul");

        pedido.registrarCliente(cliente);
        pedido.registrarVendedor(vendedor);
        pedido.mostrarPedido();
    }
}