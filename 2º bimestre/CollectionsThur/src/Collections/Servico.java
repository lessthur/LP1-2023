package Collections;

public class Servico extends Item{
    private boolean disponivel;

    public Servico(long id, String nome, double preco) {
        super(id, nome, preco);
    }

    public boolean getServico() {
        return disponivel;
    }

    public void setServico(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public static void liberar(){
        System.out.println("Liberado.");
    }

    @Override
    public String toString() {
        return "Servico{" + "disponivel=" + disponivel + '}';
    }
}
