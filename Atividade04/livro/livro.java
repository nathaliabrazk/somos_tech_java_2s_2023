package Atividade04.livro;

public class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca() {
        livros = new Livro[10];
        contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < 10) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro adicionado com sucesso: " + livro.getTitulo());
        } else {
            System.out.println("A biblioteca está cheia. Não é possível adicionar mais livros.");
        }
    }

    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (int i = 0; i < contador; i++) {
            System.out.println(livros[i].getTitulo() + " por " + livros[i].getAutor());
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        Livro livro2 = new Livro("A Máquina do Tempo", "H.G. Wells");
        Livro livro3 = new Livro("1984", "George Orwell");
        Livro livro4 = new Livro("Crepúsculo", "Stephenie Meyer");
        Livro livro5 = new Livro("A biblioteca da meia noite", "Matt Haig");
        Livro livro6 = new Livro("Mulheres que correm com os lobos", "Clarissa Pinkola Estés");
        Livro livro7 = new Livro("É assim que acaba", "Colleen Hoover");
        Livro livro8 = new Livro("A morte é um dia que vale a pena viver", "Ana Clara Quitana");
        Livro livro9 = new Livro("Mentes extraordinárias", "Alberto Dell'Isola");
        Livro livro10 = new Livro("Apartamento de Paris", "Lucy Foley");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);
        biblioteca.adicionarLivro(livro7);
        biblioteca.adicionarLivro(livro8);
        biblioteca.adicionarLivro(livro9);
        biblioteca.adicionarLivro(livro10);

        biblioteca.listarLivros();
    }
}
