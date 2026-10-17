import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor("Pedro");
        Editora editora1 = new Editora("UICLAP");
        Autor autor1 = new Autor("Icaro gonçalves");
        Autor autor2 = new Autor("Icaro gonçalves");
       
        Livro livro = new Livro("A morte tal", "1999", Arrays.asList(autor1, autor2), editora1);

        ServicoDeEmprestimo emprestimo = new ServicoDeEmprestimo();
        emprestimo.emprestarLivro(leitor, livro);
        livro.setLeitorAtual(leitor);

        
        livro.getLeitorAtual();
    }
}
