package sistema.arcondicionado;
public class Main {
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado(true, 18);
        
        arCondicionado.getEstado();
        arCondicionado.setTempDesejada(12);
        System.out.println("temperatura atual do ar: " + arCondicionado.getTempAtual()); 

    }
}
