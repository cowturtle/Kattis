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

class ThisAintYourGrandpasCheckerboard {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            board[i] = sc.getWord().toCharArray();
        }
        System.out.println(rowColCheck(board) && threeCheck(board) ? 1 : 0);
        sc.close();
    }

    static boolean rowColCheck(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            int rb = 0, rw = 0, cb = 0, cw = 0;
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'B') rb++;
                else rw++;
                if (board[j][i] == 'B') cb++;
                else cw++;
            }
            if (rb != rw || cb != cw) return false;
        }
        return true;
    }

    static boolean threeCheck(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = 0; j < n - 3; j++) {
                if ((board[i][j] == 'B' && board[i + 1][j] == 'B' && board[i + 2][j] == 'B') 
                    || (board[i][j] == 'W' && board[i + 1][j] == 'W' && board[i + 2][j] == 'W')
                    || (board[i][j] == 'B' && board[i][j + 1] == 'B' && board[i][j + 2] == 'B')
                    || (board[i][j] == 'W' && board[i][j + 1] == 'W' && board[i][j + 2] == 'W')) return false;
            }
        }
        return true;
    }
    
}
