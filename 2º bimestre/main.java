import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta = 'S';
        Veiculo modelo;
        Veiculo ano;
        Veiculo marca;
        Veiculo tipo;

        while (resposta == 'S'){
            System.out.println("Qual é o modelo do carro? ");

            System.out.println("Deseja informar outro veículo? Se sim, digite S, se não, digite N.");
            resposta = scanner.next().charAt(0);
        }
    }
}
