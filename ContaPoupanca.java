public class ContaPoupanca extends Conta{
    double taxaDeRendimento;

    public ContaPoupanca(String titular, double taxaDeRendimento) {
        super(titular); // construtor superClasse
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void aplicarRendimento(){
        double rendimento = getSaldo() * taxaDeRendimento;
        depositar(rendimento);
    }
}