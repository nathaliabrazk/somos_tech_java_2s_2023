package aula02;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

         Scanner sc = new Scanner (System.in);

         System.out.println("Digite um número intero positivo");

         int numero = sc.nextInt();

         System.out.println("Exemplo for");

         for(int i = 2; i <= numero; i += 2){
            System.out.println(i);
         }
    }
}
