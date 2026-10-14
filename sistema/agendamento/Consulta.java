package sistema.agendamento;
public class Consulta {
    private String data;
    private String horario;
    private Paciente paciente;
    private Medico medico;


    public Consulta(String data, String horario, Paciente pasciente, Medico medico){
        this.data = data;
        this.horario = horario;
        this.paciente = pasciente;
        this.medico = medico;
    }

    public void confirmarConsulta(){
        System.out.println("Consulta confirmada " + paciente.getNome() + " com o médico: " + medico.getNome() + " no dia " + data + " às " + horario);
    }

}
