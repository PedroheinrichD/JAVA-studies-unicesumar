package escola.sistema;
public class MainEscola {
    public static void main(String[] args) {
        Professor professor = new Professor("Julio marcelo");
        Disciplina disciplina = new Disciplina("Matemática");

        // adiciona disciplina
        professor.adicionarDisciplina(disciplina);
    }
}
