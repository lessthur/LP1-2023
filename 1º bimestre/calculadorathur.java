import java.util.Scanner;

public class calculadorathur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1;
        double n2;
        double result;
        char op = '+';
        char opt = 'S';

        System.out.println("Calculadora Simples - Seja bem vind@!");

        while (opt == 'S') {
            //opt = input.next().charAt(0);
            while (op == '+' || op == '-' || op == '/' || op == '*') {
                System.out.println("Digite o primeiro número da operação: ");
                n1 = input.nextInt();

                System.out.println("Digite a operação que deseja realizar (+, -, /, *): ");
                op = input.next().charAt(0);

                System.out.println("Digite o segundo número da operação: ");
                n2 = input.nextInt();

                if (op == '+'){
                    result = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " +result);
                    System.out.println("Para continuar a calcular, digite 'S', caso contrário, digite 'N' ");
                }else if (op == '-'){
                    result = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " +result);
                    System.out.println("Para continuar a calcular, digite 'S', caso contrário, digite 'N' ");
                }else if(op == '/'){
                    result = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " +result);
                    System.out.println("Para continuar a calcular, digite 'S', caso contrário, digite 'N' ");
                }else if(op == '*'){
                    result = n1 * n2;
                    System.out.println(n1 + " * " + n2 + " = " +result);
                    System.out.println("Para continuar a calcular, digite 'S', caso contrário, digite 'N' ");
                }else{
                    System.out.println("Operação inválida! ");
                }
                opt = input.next().charAt(0);
            }
        }
    }
}