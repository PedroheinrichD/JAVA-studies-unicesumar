package escola.sistema;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinas; // diciplina é uma variável do tipo List que pode armazenar objetos Disciplina
    // cada disciplina é um obj

    public Professor(String nome){
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina d){
        disciplinas.add(d);
    }
}


/*
    em arrayList<>(); armazena varias disciplinas, pois um professor tem uma ou mais disciplinas, 
    e cada disciplina deste array é um objeto do tipo Disciplina
*/