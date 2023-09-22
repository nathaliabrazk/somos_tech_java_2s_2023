package aula02;

import java.util.Scanner;
public class CalculoMediaEstrutura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media == 7.0){
            System.out.println("Você foi aprovado no limite!");
        }else if(media < 7.0){
                System.out.println("Você foi reprovado!");
            }else if(media == 10.0){
            System.out.println("Parabéns, você tirou nota máxima");
        }else{
            System.out.println("Você foi aprovado!");
        }

    }
}