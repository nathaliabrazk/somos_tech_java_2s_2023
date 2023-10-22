package Atividade02;
//Crie um programa Java que declare duas variáveis do tipo String para armazenar o primeiro nome 
//e o sobrenome de uma pessoa. Em seguida, concatene essas duas strings para formar o nome completo e exiba-o na tela.
import java.util.Scanner;

public class ContatenacaoString {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String primeiroNome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Seu nome completo é: " + primeiroNome + sobrenome);
    }
    
}
