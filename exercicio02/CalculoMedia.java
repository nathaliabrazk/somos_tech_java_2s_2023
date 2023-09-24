package exercicio02;
//Escreva um programa Java que declare três variáveis do tipo double para representar as notas 
//de um aluno em três provas diferentes. Calcule e exiba a média das notas.

import java.util.Scanner;

public class CalculoMedia{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //primeiro valor
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        //segundo valor
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

         System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();


        double media = (nota1 + nota2 + nota3 )/3;

        System.out.println("A média é: " + media);
}
}