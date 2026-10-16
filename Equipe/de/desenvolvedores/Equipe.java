package Equipe.de.desenvolvedores;

import java.util.ArrayList;
import java.util.List;

// exemplo de agregação, as partes vivem sem o todo

public class Equipe {
    private String nome;
    private List<Desenvolvedor> membros;

    public Equipe(String nome){
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    // adiciona desenvolvedores
    public void adicionarEquipe(Desenvolvedor d){
        membros.add(d);
    }

    public void getEquipe(){
        for(Desenvolvedor membro : membros)

        System.out.println("Estão na equipe " + nome + " Os desenvolvedores: " + membro.getNome());
    }
}
