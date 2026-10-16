package Equipe.de.desenvolvedores;
public class MainEquipes {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro Dias");
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Icaro gonçalves");
        
        Equipe equipe = new Equipe("Java Back-end");

        equipe.adicionarEquipe(desenvolvedor);
        equipe.adicionarEquipe(desenvolvedor2);

        equipe.getEquipe();
    }
}
