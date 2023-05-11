import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome_Bib;
    private Dono dono;
    private List<Livros> livros = new ArrayList<>();
    private List<Funcionarios> funcionarios = new ArrayList<>();

    public Biblioteca(String nome_Bib, Dono dono) {
        this.nome_Bib = nome_Bib;
        this.dono = dono;
    }

    public String getNome_Bib(){
        return nome_Bib;
    }

    public void setNome_Bib(String nome_Bib){
        this.nome_Bib = nome_Bib;
    }

    public Dono getdono(){
        return dono;
    }

    public void setdono(Dono dono){
        this.dono = dono;
    }


    public void addLivros(Livros livros){
        this.livros.add(livros);
    }

    public void addFuncionarios(Funcionarios funcionarios){
        this.funcionarios.add(funcionarios);
    }

    public void mostrarLivros(){
        for (Livros i: this.livros) {
            System.out.println("Nome do livro: " + i.getNome_Liv());
            System.out.println("Autor: " + i.getAutor());
            System.out.println("Ano de lançamento: " + i.getAno());
            System.out.println("\n");
        }
    }

    public void mostrarFuncionarios(){
        for (Funcionarios j: this.funcionarios) {
            System.out.println("Nome do funcionário: " + j.getNome_Func());
            System.out.println("CPF: " + j.getCpf_Func());
            System.out.println("\n");
        }
    }
}