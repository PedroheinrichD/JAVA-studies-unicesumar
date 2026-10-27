package composição;
public class composicao {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        Computador computador = new Computador(impressora);


        computador.enviarParaImpressao();
    }
}
