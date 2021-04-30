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

class Peg {
    
    public static void main(String[] args) {
        new Peg();
    }

    Peg() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        char[][] board = getBoard(sc);
        System.out.println(findMoves(board));
        // sc.close();
    }

    int findMoves(char[][] board) {
        int moves = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'o') {
                    moves += checkMoves(i, j, board);    
                }
            }   
        }
        return moves;
    }

    int checkMoves(int i, int j, char[][] board) {
        return checkTop(i, j, board) + checkRight(i, j, board) + checkBottom(i, j, board) + checkLeft(i, j, board);
    }

    int checkTop(int i, int j, char[][] board) {
        if (i - 2 < 0 || i - 1 < 0
            || (board[i - 1][j] != 'o' || board[i - 2][j] != '.')) return 0;
        return 1;
    }
    
    int checkRight(int i, int j, char[][] board) {
        if (j + 2 >= board.length || j + 1 >= board.length
            || (board[i][j + 1] != 'o' || board[i][j + 2] != '.')) return 0;
        return 1;
    }
    
    int checkBottom(int i, int j, char[][] board) {
        if (i + 2 >= board.length || i + 1 >= board.length
            || (board[i + 1][j] != 'o' || board[i + 2][j] != '.')) return 0;
        return 1;
    }
    
    int checkLeft(int i, int j, char[][] board) {
        if (j - 2 < 0 || j - 1 < 0
            || (board[i][j - 1] != 'o' || board[i][j - 2] != '.')) return 0;
        return 1;
    }

    char[][] getBoard(Kattio sc) {
        char[][] board = new char[7][7];
        boardDefault(board);        

        for (int i = 0; i < board.length; i++) {
            char[] arr = sc.getWord().toCharArray();
            if (i == 0 || i == 1 || i == 5 || i == 6) {
                for (int j = 2; j < 2 + arr.length; j++) {
                    board[i][j] = arr[j - 2];
                }
            } else {
                board[i] = arr;
            }
        }
        return board;
    }

    void boardDefault(char[][] board) {
        board[0][0] = '-';
        board[0][1] = '-';
        board[0][5] = '-';
        board[0][6] = '-';

        board[1][0] = '-';
        board[1][1] = '-';
        board[1][5] = '-';
        board[1][6] = '-';

        board[5][0] = '-';
        board[5][1] = '-';
        board[5][5] = '-';
        board[5][6] = '-';

        board[6][0] = '-';
        board[6][1] = '-';
        board[6][5] = '-';
        board[6][6] = '-';
    }

}
