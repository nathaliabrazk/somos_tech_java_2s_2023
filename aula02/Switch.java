package aula02;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Digite um número de 1 a 7: ");
        int diaSemana = input.nextInt();
        String nomeDia;

        switch(diaSemana){
            case 1:
                nomeDia = "Domingo";
            break;
            case 2:
                nomeDia = "Segunda-feira";
            break;
            case 3:
                nomeDia = "Terça-feira";
            break;
            case 4:
                nomeDia = "Quarta-feira";
            break;
            case 5:
                nomeDia = "Quinta-feira";
            break;
            case 6:
                nomeDia = "Sexta-feira";
            break;
            case 7:
                nomeDia = "Sábado";
            break;
            default:
                nomeDia = "Inválido";
        }
    }
}
