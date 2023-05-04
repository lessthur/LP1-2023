import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome_Bib;
    private String dono;
    private List<Livros> livros = new ArrayList<>();
    private List<Funcionarios> funcionarios = new ArrayList<>();

    public Biblioteca(String nome_Bib, String dono) {
        this.nome_Bib = nome_Bib;
        this.dono = dono;
    }

    public String getNome_Bib(String nome_Bib){
        return nome_Bib;
    }

    public void setNome_Bib(String nome_Bib){
        this.nome_Bib = nome_Bib;
    }

    public String getdono(String dono){
        return dono;
    }

    public void setdono(String dono){
        this.dono = dono;
    }

    public void mostrarLivros(){
        System.out.println(livros);
    }

    public void addLivros(Livros livros){
        this.livros.add(livros);
    }

    public void addFuncionarios(Funcionarios funcionarios){
        this.funcionarios.add(funcionarios);
    }
}