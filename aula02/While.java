package aula02;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);

         System.out.println("Digite um número intero positivo");

         int numero = sc.nextInt();

         System.out.println("Exemplo while");

         int i = 2;

         while(i <= numero){
            System.out.println(i);
            i += 2;
         }
    }
    }
