
public class metodoComParametro {

    public static void main(String[] args) {
        saudacao();
        exibirDobro(8);
    }

    public static void saudacao() {
        System.out.println("Olá, seja bem-vindo ao Programa");
    }

    public static void exibirDobro(int numero) {
        int resultado = numero * 2;
        System.out.println("o dobro do número " + numero + " é " + resultado);
    }

}
