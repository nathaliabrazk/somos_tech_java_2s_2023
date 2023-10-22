//Crie uma classe chamada Pessoa com os atributos nome (String) e idade (int). Em seguida, crie uma função 
//chamada imprimePessoa que recebe um objeto do tipo Pessoa como parâmetro e imprime o nome e a idade da pessoa. 
//No método main, crie dois objetos do tipo Pessoa e chame a função imprimePessoa para exibir suas informações.

package Atividade04.pessoa;

//classe 
public class Pessoa {
    //atributos
    String nome;
    int idade; 

    //construtor da classe pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //função
    public static void imprimePessoa(Pessoa pessoa){
        System.out.println("Nome: "+ pessoa.nome);
        System.out.println("\nidade: "+ pessoa.idade);
    }

    public static void main(String[]args){
        Pessoa pessoa1 = new Pessoa("Rosa", 45);
        Pessoa pessoa2 = new Pessoa("Luiz", 70);

        // Chamando a função
        System.out.println("Informações da primeira pessoa:");
        imprimePessoa(pessoa1);

        System.out.println("\nInformações da segunda pessoa:");
        imprimePessoa(pessoa2);
    }
    
}
