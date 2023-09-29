package aula03;
//crie um array de iteiro com 5 elemntos e preencha-os
public class Exercicio01 {
    public static void main(String[] args) {
        
        int [] numerosSoma = {6, 7, 8, 9};
        int soma = 0;

        for(int i = 0; i<numerosSoma.length; i ++){
            soma += numerosSoma[i]; 
        }
        System.out.println("a soma é " + soma);

    }
}
