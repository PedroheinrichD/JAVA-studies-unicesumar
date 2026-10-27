package Restaurante;

/**
 * Cliente
 */
public class Cliente {

    private String nome;
    private String endereco;
    private String CPF;

    public Cliente(String nome, String endereco, String CPF) {
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
    }


    public void fazerPedido(String pedido){
        System.out.println("Pedido " + pedido + " feito.");
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

}
