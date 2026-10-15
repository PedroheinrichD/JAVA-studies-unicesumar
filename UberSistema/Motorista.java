package UberSistema;

public class Motorista {

    String nome;
    String telefone;
    String modeloCarro;
    String placa;
    
    Passageiro passageiro;

    public Motorista(String nome, String telefone, String modeloCarro , String placa){
        this.nome = nome;
        this.telefone = telefone;
        this.modeloCarro = modeloCarro;
        this.placa = placa;
    }


    public void buscarPassageiro(Passageiro passageiro){
        this.passageiro = passageiro; // guarda na referencia o objeto passado
        System.out.println("Buscar " + passageiro.getNome() + " telefone: "+ passageiro.getTelefone() + " na " + passageiro.getLocalizacao());
    }

    public void confirmarRota(){
        System.out.println("Confirmado, o motorista " + nome + " buscará o " + passageiro.getNome());
    }


}
