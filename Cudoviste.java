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

class Cudoviste {
    
    public static void main(String[] args) {
        new Cudoviste();
    }

    Cudoviste() {
        answer();
    }

    static final String DUDE_NAME = "PER";

    void answer() { 
        char[][] board = readBoard();
        System.out.println(getParkingSpaces(board));
    }

    String getParkingSpaces(char[][] board) {
        int ZERO = 0, ONE = 0, TWO = 0, THREE = 0, FOUR = 0;

        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board[i].length - 1; j++) {
                char c1 = board[i][j];
                char c2 = board[i + 1][j];
                char c3 = board[i][j + 1];
                char c4 = board[i + 1][j + 1];

                if (c1 == '#' 
                    || c2 == '#' 
                    || c3 == '#' 
                    || c4 == '#') continue;
                
                int temp = (c1 == 'X' ? 1 : 0)
                            + (c2 == 'X' ? 1 : 0)
                            + (c3 == 'X' ? 1 : 0)
                            + (c4 == 'X' ? 1 : 0);
                
                if (temp == 0) {
                    ZERO++;
                } else if (temp == 1) {
                    ONE++;
                } else if (temp == 2) {
                    TWO++;
                } else if (temp == 3) {
                    THREE++;
                } else if (temp == 4) {
                    FOUR++;
                }
            }
        }

        return ZERO + "\n" 
                + ONE + "\n" 
                + TWO + "\n" 
                + THREE + "\n" 
                + FOUR;
    }

    char[][] readBoard() {
        Kattio sc = new Kattio(System.in);
        char[][] board = new char[sc.getInt()][sc.getInt()];
        for (int i = 0; i < board.length; i++) 
            board[i] = sc.getWord().toCharArray();
        // sc.close();
        return board;
    }

}
