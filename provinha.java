import java.util.Scanner;
import java.util.Arrays;

public class provinha {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor[] = new double [2];
        int opcao;
        int valores[] = new int [2];
        int k = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            valor[i] = input.nextInt();
        }

        System.out.println("Digite um número inteiro como opção: ");
        opcao = input.nextInt();

        System.out.println(exercicio1(opcao, valor));

        exercicio2(valores, k);
    }

    public static double exercicio1 (int opcao, double valor[]){
        if (opcao == 1){
            return valor[0] + valor[1];
        }else if (opcao == 2){
            return valor[0] - valor[1];
        }else if (opcao == 3){
            return valor[0] * valor[1];
        }else if (opcao == 4){
            return valor[0] / valor[1];
        }else{
            System.out.println("Opção inválida! ");
        }

        return 0;
    }

    public static void exercicio2 (int valores[], int k){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        valores[0] = input.nextInt();
        System.out.println("Digite o número de colunas: ");
        valores[1]= input.nextInt();

        int tabela[][] = new int[valores[0]][valores[1]];

        for (int i = 0; i <= (valores[0]-1); i++) {
            for (int j = 0; j <= (valores[1]-1); j++) {
                tabela[i][j] = i + j;
            }
        }

        for (int cont = 0; cont < valores[0]; cont++) {
            for (int cont2 = 0; cont2 < valores[1]; cont2++) {
                System.out.print( k + " | ");
                k++;
            }
            System.out.println(" ");
        }
    }
}

