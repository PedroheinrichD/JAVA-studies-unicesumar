package sistema.agendamento;
public class Principal {
    public static void main(String[] args){
        
        Paciente paciente = new Paciente("Pedro", "128.213.123-52", "16997729706");
        
        Medico medico = new Medico("Alfredo", "Ortopedista");
        
        Consulta consulta = new Consulta("14/10/2026", "12:00", paciente, medico);
        consulta.confirmarConsulta();
        
        Agenda agenda = new Agenda();
        agenda.adicionaHorario("12:00");
        agenda.adicionaHorario("13:00");
        agenda.adicionaHorario("16:00");
        agenda.adicionaHorario("17:00");
        
        
        paciente.agendarConsulta(consulta);
        medico.visualizarAgenda(agenda);

    }
}
