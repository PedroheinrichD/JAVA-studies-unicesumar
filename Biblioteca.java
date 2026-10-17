import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros; // lista de obj que guardam livros

    public Biblioteca(String nome){
        this.nome = "Biblioteca Municipal";
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public String getNome() {
        return nome;
    }
}
