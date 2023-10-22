package Atividade02;
//Crie um programa que solicite ao usuário duas notas e calcule a média. Em seguida, utilize uma 
//estrutura if/else para determinar se o aluno foi aprovado (média maior ou igual a 6) ou reprovado.
import java.util.Scanner;

public class MediaIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota01 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota02 = scanner.nextDouble();

        double media = nota01 + nota02/ 02;

            if (media >= 6){
                System.out.println("Sua média é: " + media +" Parabéns você passou!");
            }else{
                System.out.println("Sua média é: " + media +" Infelizmente você reprovou!");
            }
    }
}
