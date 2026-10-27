package Restaurante;


public class PedidoDelivery extends Pedido{
    private Cliente cliente;

    public PedidoDelivery(Cliente cliente, int codigoPedido, String dataEmissao, double valorTotal) {
        super(codigoPedido, dataEmissao, valorTotal);
        this.cliente = cliente;
    }

    public void entregarPedido(){
        System.out.println("Pedido entregue no endereço " + cliente.getEndereco() + " Recebido por: " + cliente.getNome());
        setStatus("Entregue");
    }
}
