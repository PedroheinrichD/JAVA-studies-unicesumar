public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;

    // constructor para Pasciente
    public Paciente(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void agendarConsulta(Consulta consulta){
        System.out.println("Consulta agendada para o paciente" + nome);
    }

    public String getNome(){
        return nome;   
    }
    
    public String getCpf(){
        return cpf;   
    }
    
    public String getTelefone(){
        return telefone;   
    }
}