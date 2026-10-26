public class Banco {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Pedro", 2.5);
        contaPoupanca.depositar(10);
        contaPoupanca.aplicarRendimento();

        System.out.println("Saldo atual de " + contaPoupanca.getTitular() + " é R$" + contaPoupanca.getSaldo());
    }
}
