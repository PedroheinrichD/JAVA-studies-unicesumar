package sistema.arcondicionado;
/*
    temperatura atual,
    estado (ligado ou desligado)
    temperatura desejada
 */

public class ArCondicionado {

    private boolean estado;
    private int tempAtual;
    private int tempDesejada;

    public ArCondicionado(boolean estado, int tempAtual) {
        this.estado = estado;
        this.tempAtual = tempAtual;
    }

    // getters
    public int getTempAtual() {
        return tempAtual;
    }

    public void getEstado() {
        if (estado) {
            System.out.println("Ar-condicionado está ligado");
            return;
        }

        System.out.println("Ar-condicionado está Desligado");
    }

    // setter para alterar a temperatura
    public void setTempDesejada(int valor) {

        if (valor < 16 || valor > 30) {
            System.out.println("Valor indesejado, valor desejado entre 16° e 30°");
            return;
        }

        this.tempDesejada = valor;
        tempAtual = tempDesejada;
    }
}
