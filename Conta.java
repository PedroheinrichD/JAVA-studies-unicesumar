// superClass
public class Conta {
    private String titular;
    private double saldo;

    //construtor
    public Conta(String titular){
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    //métodos publicos getter/setter
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
}
