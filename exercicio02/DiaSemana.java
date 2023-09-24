package exercicio02;
//Peça ao usuário para inserir um número de 1 a 7 representando um dia da semana. Use uma estrutura 
//switch para exibir o nome do dia correspondente (por exemplo, 1 = Domingo, 2 = Segunda-feira, etc.).
//Se o usuário inserir um número fora do intervalo, mostre uma mensagem de erro.
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        switch(numero) {
            case 1:
                System.out.println("Domingo");
            break;

            case 2:
              System.out.println("Segunda-feira");
            break;

            case 3:
              System.out.println("Terça-feira");
            break;

            case 4:
              System.out.println("Quarta-feira");
            break;

            case 5:
              System.out.println("Quinta-feira");
            break;

            case 6:
              System.out.println("Sexta-feira");
            break;

            case 7:
              System.out.println("Sábado");
            break;

            default:
                System.out.println("Erro: escolha um número válido!.");
        }
        
    }
}
