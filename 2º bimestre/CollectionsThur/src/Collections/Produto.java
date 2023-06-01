package Collections;

public class Produto {
    private int estoque;

    public Produto(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +  "estoque=" + estoque + '}';
    }

    public void comercializa() throws ComercializarException {
        if (estoque <= 0){
            throw new ComercializarException("Este produto não está disponível no estoque");
        }
        estoque = estoque - 1;
    }
}
