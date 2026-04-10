package Aula05.Q02;

public class Pedido {
    private String descricao;
    private Cliente cliente;
    private Vendedor vendedor;

    public Pedido(String descricao) {
        this.descricao = descricao;
    }

    public void registrarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void registrarVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void mostrarPedido() {
        System.out.println(cliente.getNome() + " fez um pedido emitido por " + vendedor.getNome() + ": " + descricao);
    }
}