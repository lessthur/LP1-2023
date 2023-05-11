public class Funcionarios {
    private String nome_Func;
    private String cpf_Func;

    public Funcionarios(String nome_Func, String cpf_Func) {
        this.nome_Func = nome_Func;
        this.cpf_Func = cpf_Func;
    }

    public String getNome_Func(){
        return this.nome_Func;
    }

    public void setNome_Func(String nome_Func){
        this.nome_Func = nome_Func;
    }

    public String getCpf_Func(){
        return this.cpf_Func;
    }

    public void setCpf_Func(String cpf_Func){
        this.cpf_Func = cpf_Func;
    }
}