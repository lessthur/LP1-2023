import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("BIBLIOTECA DO THUR", new Dono ("Arthur Augusto", "499.478.988-65"));
        //biblioteca.setNome_Bib("Biblioteca do Thur ");
        //biblioteca.setdono("Thur ");

        Dono dono = new Dono("Arthur Augusto", "499.478.988-65");

        Funcionarios funcionario1 = new Funcionarios("Davi Gomes", "417.986.769-02");
        Funcionarios funcionario2 = new Funcionarios("Henry Viado", "472.216.018-01");
        Funcionarios funcionario3 = new Funcionarios("Isabela Piano", "123.456.789-10");

        Livros livro1 = new Livros("É Assim que Acaba", "Colleen Hoover", 2019);
        Livros livro2 = new Livros("Revolução dos Bichos", "George Orwell", 1928);
        Livros livro3 = new Livros("As façanhas de Hércules", "Monteiro Lobato", 2013);
        Livros livro4 = new Livros("Meditações", "Marco Aurélio", 180);
        Livros livro5 = new Livros("Memórias Póstumas de Bras Cubas", "Machado de Assis", 1881);

        biblioteca.addFuncionarios(funcionario1);
        biblioteca.addFuncionarios(funcionario2);
        biblioteca.addFuncionarios(funcionario3);

        biblioteca.addLivros(livro1);
        biblioteca.addLivros(livro2);
        biblioteca.addLivros(livro3);
        biblioteca.addLivros(livro4);
        biblioteca.addLivros(livro5);

        System.out.println(biblioteca.getNome_Bib());
        System.out.println("\n ");
        System.out.println("FUNCIONÁRIOS:");
        biblioteca.mostrarFuncionarios();
        System.out.println("\n ");
        System.out.println("LIVROS");
        biblioteca.mostrarLivros();


    }
}
