
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Seu nome é: " + nome + "! Você tem " + idade + " anos.");
        sc.close();
    }
}
