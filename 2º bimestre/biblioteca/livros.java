public class livros {
    private String nome_Liv;
    private String autor;
    private int ano;

    public livros(String nome_Liv, String autor, int ano) {
        this.nome_Liv = nome_Liv;
        this.autor = autor;
        this.ano = ano;
    }

    public String getNome_Liv(String nome_Liv){
        return this.nome_Liv;
    }

    public void setNome_Liv(String nome_Liv){
        this.nome_Liv = nome_Liv;
    }

    public String getAutor(String autor){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAno(int ano){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}