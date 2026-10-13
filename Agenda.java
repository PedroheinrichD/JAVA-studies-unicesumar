
import java.util.ArrayList;

public class Agenda {
    // criando uma lista de strings
    private ArrayList<String> horarioDisponiveis = new ArrayList<>();

    // adiciona à lista de horarioDisponiveis
    public void adicionaHorario(String horario){
        horarioDisponiveis.add(horario);
    }

    // para cada item de horarioDisponiveis adiciona à variavel horario e exibe
    public void mostrarHorariosDisponiveis() {
        for (String horario : horarioDisponiveis){
            System.out.println(horario);
        }
    }
}
