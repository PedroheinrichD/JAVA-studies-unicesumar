package Restaurante;


public class PedidoLocal extends Pedido{
    private int numeroDaMesa;


    public PedidoLocal(int numeroDaMesa, int codigoPedido, String dataEmissao, double valorTotal) {
        super(codigoPedido, dataEmissao, valorTotal);
        this.numeroDaMesa = numeroDaMesa;
    }

    public void entregarPedido(){
        System.out.println("Pedido entregue para a mesa " + numeroDaMesa);
        setStatus("Entregue");
    }
}
