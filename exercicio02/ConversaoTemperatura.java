package exercicio02;
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius: ");
        double celsius = scanner.nextDouble();

        double Fahrenheit = celsius *(9/5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + Fahrenheit);



    }
}
