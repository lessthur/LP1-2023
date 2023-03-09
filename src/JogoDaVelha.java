import java.util.Scanner;
public class JogoDaVelha {
    public static boolean vitoria(char [][] jogo){
        //horizontais
        if((jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X') || (jogo[0][0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O')){
            return true;
        }else if((jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X') || (jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O')){
            return true;
        }else if((jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') || (jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O')){
            return true;
        }
        //verticais
        else if((jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') || (jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O')){
            return true;
        }else if((jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') || (jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O')) {
            return true;
        }else if((jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') || (jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O')){
            return true;
        }
        //diagonais
        else if((jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') || (jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O')){
            return true;
        }else if((jogo[0][2] == 'X' && jogo[1][1] == 'X' && jogo[2][0] == 'X') || (jogo[0][2] == 'O' && jogo[1][1] == 'O' && jogo[2][0] == 'O')){
            return true;
        }
        return true;
    }

    public static boolean empate(char [][] jogo){
        if((jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X') || (jogo[0][0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O')){
            return false;
        }else if((jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X') || (jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O')){
            return false;
        }else if((jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') || (jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O')){
            return false;
        }
        //verticais
        else if((jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') || (jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O')){
            return false;
        }else if((jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') || (jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O')) {
            return false;
        }else if((jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') || (jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O')){
            return false;
        }
        //diagonais
        else if((jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') || (jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O')){
            return false;
        }else if((jogo[0][2] == 'X' && jogo[1][1] == 'X' && jogo[2][0] == 'X') || (jogo[0][2] == 'O' && jogo[1][1] == 'O' && jogo[2][0] == 'O')){
            return false;
        }else {
            return true;
        }
    }

    public static void imprimeTabuleiro(char[][] jogo){
        for (int i = 0; i < 3; i++) {
            System.out.println("|  |  |  |");
            for (int j = 0; j < 3; j++) {

            }
            System.out.println("__________");
        }
    }
    //char [][] jogo = new char[3][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [][] jogo = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        //while (!vitoria(jogo) || !empate(jogo)){
        imprimeTabuleiro(jogo);
    }
}

