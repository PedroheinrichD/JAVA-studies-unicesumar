import java.util.List;

public class Livro {
    private String titulo;
    private String ano;
    private List<Autor> autores;
    private Editora editora;  // somente nome
    private Leitor leitor;

    public Livro(String titulo, String ano, List<Autor> autores, Editora editora){
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
        this.editora = editora;
    }

    public Leitor getLeitorAtual() {
        return leitor;
    }

    public void setLeitorAtual(Leitor leitor) {
        this.leitor = leitor;
    }

    public String getTitulo(){
        return titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }
    
    public Editora getEditora() {
        return editora;
    }
    
    public String getAno(){
        return ano;
    }
}
