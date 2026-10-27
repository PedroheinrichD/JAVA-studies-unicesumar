package Restaurante;
public class Restaurante {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro","Rua A, 123 - JD Alvorada", "4148925295");
        Cliente cliente2 = new Cliente("Maria","Rua C, 409 - Professor de freitas", "999912442");

        PedidoDelivery pedidoDelivery = new PedidoDelivery(cliente, 12536, "12/22/2012", 12.99);
        PedidoLocal pedidoLocal = new PedidoLocal(5, cliente2, 12539, "13/01/2013", 29.99);


        pedidoDelivery.prepararPedido();
        pedidoDelivery.entregarPedido();

        pedidoLocal.prepararPedido();
        pedidoLocal.cancelarPedido();
    }
}
