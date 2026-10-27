package Restaurante;


public class Pedido {
    private int codigoPedido;
    private String dataEmissao;
    private String status;
    private double valorTotal;

    public Pedido(int codigoPedido, String dataEmissao, double valorTotal) {
        this.codigoPedido = codigoPedido;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
    }

    public void prepararPedido() {
        System.out.println("Pedido " + codigoPedido + " está sendo preparado...");
        status = "Em preparo. ";
    }

    public void finalizarPedido() {
        System.out.println("Pedido finalizado.");
        setStatus("Finalizado");
    }

    public void cancelarPedido() {
        System.out.println("Pedido cancelado.");
        status = "Cancelado. ";
    }

    public String getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
