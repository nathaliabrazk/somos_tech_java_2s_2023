package Atividade02;
//Peça ao usuário para inserir um número inteiro positivo. Em seguida, crie dois programas: 
//um usando um loop for e outro usando um loop while. Ambos devem contar e exibir todos os 
//números pares de 1 até o número inserido pelo usuário.
import java.util.Scanner;
public class ContagemFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro positivo: ");
        int numero = scanner.nextInt();
        System.out.println("-------------------");

        if (numero <= 0) {
            System.out.println("O número digitado não é inteiro positivo.");
        } else {
            System.out.println("Números inteiros de 1 até " + numero + " com for:");
            for (int i = 1; i <= numero; i++) {
                System.out.println(i+=1);
            }
        }
    }
}


