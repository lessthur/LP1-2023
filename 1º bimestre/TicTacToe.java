import java.util.Scanner;

public class TicTacToe {

    static int count = 0;
    private static char[][] board = new char[3][3];

    private static char currentPlayer = 'X';

    public static void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public static void placeMark(int row, int col) {
        board[row][col] = currentPlayer;
    }

    public static boolean isGameOver() {
        count++;
        if (checkRows() || checkColumns() || checkDiagonals()) {
            printBoard();
            switchPlayer();
            System.out.println(currentPlayer + "'s wins!");
            return (true);
        } else if(count >= 10){
            System.out.println("Draw.");
            return (true);
        }
        else {
            return false;
        }
    }


    private static boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonals() {
        return (checkRowCol(board[0][0], board[1][1], board[2][2]) || checkRowCol(board[0][2], board[1][1], board[2][0]));
    }

    private static boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer = 'S';
        while (answer == 'S' || answer == 's') {
            initBoard();
            System.out.println("Tic Tac Toe Game");
            while (!isGameOver()) {
                printBoard();
                System.out.println(currentPlayer + "'s turn");
                System.out.print("Enter row number (1-3): ");
                int row = scanner.nextInt() - 1;
                System.out.print("Enter column number (1-3): ");
                int col = scanner.nextInt() - 1;
                if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                    System.out.println("Invalid move. Try again.");
                    continue;
                } else {
                    placeMark(row, col);
                    switchPlayer();
                }
            }
            System.out.println("Para continuar, digite 'S', caso contrário, digite 'N': ");
            answer = scanner.next().charAt(0);
        }
    }
}