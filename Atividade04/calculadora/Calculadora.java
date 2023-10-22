package Atividade04.calculadora;
//Crie uma classe chamada Calculadora com métodos para realizar as operações de soma, subtração, multiplicação 
//e divisão de dois números. Cada método deve receber dois números como parâmetros e retornar o resultado da 
//operação. No método main, utilize a classe Calculadora para realizar diferentes operações e exibir os resultados.

//classe
public class Calculadora {
    // Método para somar 
    public static double somar(double a, double b) {
        return a + b;
    }
    
    // Método para subtrair 
    public static double subtrair(double a, double b) {
        return a - b;
    }
    
    // Método para multiplicar 
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    // Método para dividir dois números (verifica se o divisor não é zero)
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN; // Valor especial que representa "não é um número"
        }
    }
    
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;
    
    // Realiza diferentes operações usando a classe Calculadora
        double resultadoSoma = Calculadora.somar(num1, num2);
        double resultadoSubtracao = Calculadora.subtrair(num1, num2);
        double resultadoMultiplicacao = Calculadora.multiplicar(num1, num2);
        double resultadoDivisao = Calculadora.dividir(num1, num2);
    
        // Exibe os resultados das operações
        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}
    

 
 
 
 

 
 
 
 

 
 
 
 

 
 
 
 

 
 
 
 
 
 
 
 
 
 

 
 

 
 
 
 
 
 
 
 

 


