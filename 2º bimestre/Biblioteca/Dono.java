public class Dono {
    private String nome_Dono;
    private String CPF_Dono;

    public Dono(String nome_Dono, String CPF_Dono) {
        this.nome_Dono = nome_Dono;
        this.CPF_Dono = CPF_Dono;
    }

    public String getNome_Dono(){
        return this.nome_Dono;
    }

    public void setNome_Dono(String nome_Dono){
        this.nome_Dono = nome_Dono;
    }

    public String getCPF_Dono(){
        return this.CPF_Dono;
    }

    public void setCPF_Dono(String CPF_Dono){
        this.CPF_Dono = CPF_Dono;
    }
}