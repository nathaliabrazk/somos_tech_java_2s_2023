package exercicio02;
//Peça ao usuário para inserir um número inteiro positivo. Em seguida, crie dois programas: 
//um usando um loop for e outro usando um loop while. Ambos devem contar e exibir todos os 
//números pares de 1 até o número inserido pelo usuário.
import java.util.Scanner;

public class ContagemWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        int i = 2;

        if (numero < 0){
            System.out.println("Número digitado não é inteiro positivo!");
        }else{
            System.out.println("Números inteiros de 1 a: "+numero);
            while(i <= numero){
                System.out.println(i);
                i += 2;
            }
                
        }


    }
}
