import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
import java.text.*;

/*
 * @author Theodoric Keith Lim
 */
class EightQueens {

    final static int BOARD_LENGTH = 8;

    public static void main(String[] args) {
        new EightQueens();
    }

    EightQueens() {
        answer();
    }

    private void answer() {
        char[][] board = fillBoard();

        System.out.println(countQueens(board) && checkQueens(board) ? "valid" : "invalid");
    }

    private boolean countQueens(char[][] board) {
        int count = 0;
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int j = 0; j < BOARD_LENGTH; j++) {
                if (board[i][j] == '*') count++;
            }
        }
        return count == 8;
    }

    private boolean checkQueens(char[][] board) {
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int j = 0; j < BOARD_LENGTH; j++) {
                if (board[i][j] == '*' && !checkValid(i,j,board)) return false;
            }
        }
        return true;
    }

    private boolean checkValid(int i, int j, char[][] board) {
        return checkVertical(i,j,board) 
            && checkHorizontal(i,j,board)
            && checkRightDiagonal(i,j,board) 
            && checkLeftDiagonal(i,j,board);
    }

    private boolean checkVertical(int i, int j, char[][] board) {
        for (int k = 0; k < BOARD_LENGTH; k++) {
            if (i != k && board[k][j] == '*') return false;
        }
        return true;   
    }

    private boolean checkHorizontal(int i, int j, char[][] board) {
        for (int k = 0; k < BOARD_LENGTH; k++) {
            if (j != k && board[i][k] == '*') return false;
        }
        return true;   
    }

    private boolean checkRightDiagonal(int i, int j, char[][] board) {
        int startx = i, starty = j;
        while (startx < BOARD_LENGTH - 1 && starty > 0) {
            startx++;
            starty--;
        }
        while (startx >= 0 && starty < BOARD_LENGTH) { // 7 0 6 1
            if (startx != i && starty != j 
                && board[startx][starty] == '*') return false;
            startx--;
            starty++;
        }
        return true;
    }

    private boolean checkLeftDiagonal(int i, int j, char[][] board) {
        int startx = i, starty = j;
        while (startx < BOARD_LENGTH - 1 && starty < BOARD_LENGTH - 1) {
            startx++;
            starty++;
        }
        while (startx >= 0 && starty >= 0) {
            if (startx != i && starty != j 
                && board[startx][starty] == '*') return false;
            startx--;
            starty--;
        }
        return true;
    }

    private char[][] fillBoard() {
        char[][] board = new char[BOARD_LENGTH][BOARD_LENGTH];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < BOARD_LENGTH; i++) {
            Object[] arr = sc.nextLine().chars().mapToObj(x -> (char) x).toArray();
            for (int j = 0; j < BOARD_LENGTH; j++) {
                board[i][j] = (char) arr[j];
            }
        }
        sc.close();
        return board;
    }
}
