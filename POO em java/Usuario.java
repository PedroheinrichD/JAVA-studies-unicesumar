class Usuario {
    // Atributos
    private String nome;
    private String endereco;
    private String senha;

    // ações(métodos)
    public void cadastrar(){
        System.out.println( "Usuário cadastrado com sucesso!");
    }

    public void acessarPerfil(){
        System.out.println("Acessando o perfil do: " + nome);
    }

    public static void main(String[] args) {
        // criando a instancia , obj
        Usuario aluno = new Usuario();
        
        // definindo valores da instacia criada
        aluno.nome = "Pedro";
        aluno.endereco = "Rua A, 123 - jardim primavera";
        aluno.senha = "pedro123@!";

        // acessar ações(métodos)
        aluno.cadastrar();
    }
}