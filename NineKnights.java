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

class NineKnights {
    
    static final int BOARD_LENGTH = 5;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        char[][] board = new char[BOARD_LENGTH][BOARD_LENGTH];
        for (int i = 0; i < BOARD_LENGTH; i++)
            board[i] = sc.getWord().toCharArray();
        System.out.println(check(board) ? "valid" : "invalid");
        sc.close();
    }

    static boolean check(char[][] board) {
        int knights = 0;
        for (int i = 0; i < BOARD_LENGTH; i++) 
            for (int j = 0; j < BOARD_LENGTH; j++) 
                if (isKnight(board, i, j)) {
                    knights++;
                    if (!valid(board, i, j)) return false;
                }
        return knights == 9;
    }

    static boolean valid(char[][] board, int i, int j) {

        if (inBoard(i - 1, j - 2) && isKnight(board, i - 1, j - 2)) return false;
        if (inBoard(i + 1, j - 2) && isKnight(board, i + 1, j - 2)) return false;
        if (inBoard(i - 2, j - 1) && isKnight(board, i - 2, j - 1)) return false;
        if (inBoard(i + 2, j - 1) && isKnight(board, i + 2, j - 1)) return false;
        
        if (inBoard(i - 1, j + 2) && isKnight(board, i - 1, j + 2)) return false;
        if (inBoard(i + 1, j + 2) && isKnight(board, i + 1, j + 2)) return false;
        if (inBoard(i - 2, j + 1) && isKnight(board, i - 2, j + 1)) return false;
        if (inBoard(i + 2, j + 1) && isKnight(board, i + 2, j + 1)) return false;

        return true;
    }

    static boolean isKnight(char[][] board, int i, int j) {
        return board[i][j] == 'k';   
    }
    
    static boolean inBoard(int i, int j) {
        return 0 <= i && i < BOARD_LENGTH && 0 <= j && j < BOARD_LENGTH;
    }

}
