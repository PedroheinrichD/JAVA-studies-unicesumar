package UberSistema;
// nome, telefone e localização

public class Passageiro {

    private String nome;
    private String telefone;
    private String localizacao;

    public Passageiro(String nome, String telefone, String localizacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.localizacao = localizacao;
    }

    // encapsulando
    public String getNome() {
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public void setNome(String valor){
        this.nome = valor;
    }

    public void setTelefone(String valor){
        this.telefone = valor;
    }

    public void setLocalizacao(String valor){
        this.localizacao = valor;
    }
}
