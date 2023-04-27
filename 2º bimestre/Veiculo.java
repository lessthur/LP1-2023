public class Veiculo {
    public String marca;
    public String tipo; //caminhão, moto, veículo de passeio, etc
    public String modelo;
    public int ano;

    public Veiculo(String marca, String tipo, String modelo, int ano){
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibe(String marca, String tipo, String modelo, int ano){
        System.out.println("O carro é um " + modelo + "da marca " + marca + "e ano " + ano +". É um veículo do tipo " + tipo + "."  );
    }
}
