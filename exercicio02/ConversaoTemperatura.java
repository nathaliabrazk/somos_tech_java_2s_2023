package exercicio02;
//Escreva um programa Java que declare uma variável do tipo double para representar uma temperatura 
//em graus Celsius. Em seguida, converta essa temperatura para Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32 e exiba o resultado.

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
