package UberSistema;

public class Main {

    public static void main(String[] args) {
        
        Passageiro passageiro = new Passageiro("Pedro", "16997729706", "Rua A, 123 - Jd primavera");
        Motorista motorista = new Motorista("José Alves", "11997268725", "Onix", "FGH3H99");
        
        motorista.buscarPassageiro(passageiro);
        motorista.confirmarRota();
    

        // alterando valor com setter
        passageiro.setNome("NOme alterado");
        
    }
}
