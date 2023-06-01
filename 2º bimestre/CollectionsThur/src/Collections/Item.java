package Collections;

public abstract class Item {
    private static long idBase;
    private long id;
    private String nome;
    private double preco;

    public Item(long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public static long getIdBase() {
        return idBase;
    }

    public static void setIdBase(long idBase) {
        Item.idBase = idBase;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }
}
