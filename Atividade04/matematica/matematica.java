package Atividade04.matematica;

import java.util.Random;

public class matematica {
    public static int gerarNumeroAleatorio() {
        // Crie um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Gere um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;

        return numeroAleatorio;
    }

    public static void main(String[] args) {
        // Gere três números aleatórios e exiba-os
        for (int i = 1; i <= 3; i++) {
            int numeroAleatorio = gerarNumeroAleatorio();
            System.out.println("Número aleatório " + i + ": " + numeroAleatorio);
        }
    }
}
