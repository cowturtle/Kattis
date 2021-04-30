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

class KnightSearch {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), k = 0;
        String s = sc.getWord(), target = "ICPCASIASG";
        char[][] board = new char[n][n];
        boolean yes = false;
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++)
                board[i][j] = s.charAt(k++);
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++)
                if (board[i][j] == s.charAt(0) && foo(board, i, j, 1, target, n)) {
                    yes = true;
                    break;
                }
        System.out.println(yes ? "YES" : "NO");
        sc.close();
    }

    static boolean foo(char[][] board, int i, int j, int iter, String target, int n) {
        if (iter == target.length()) return true;
        char c = target.charAt(iter);
        if (
            (isValidCoordinate(i - 1, j - 2, n) && board[i - 1][j - 2] == c && foo(board, i - 1, j - 2, iter + 1, target, n)) 
            || (isValidCoordinate(i + 1, j - 2, n) && board[i + 1][j - 2] == c && foo(board, i + 1, j - 2, iter + 1, target, n))
            || (isValidCoordinate(i - 2, j - 1, n) && board[i - 2][j - 1] == c && foo(board, i - 2, j - 1, iter + 1, target, n)) 
            || (isValidCoordinate(i + 2, j - 1, n) && board[i + 2][j - 1] == c && foo(board, i + 2, j - 1, iter + 1, target, n))
            || (isValidCoordinate(i - 1, j + 2, n) && board[i - 1][j + 2] == c && foo(board, i - 1, j + 2, iter + 1, target, n)) 
            || (isValidCoordinate(i + 1, j + 2, n) && board[i + 1][j + 2] == c && foo(board, i + 1, j + 2, iter + 1, target, n))
            || (isValidCoordinate(i - 2, j + 1, n) && board[i - 2][j + 1] == c && foo(board, i - 2, j + 1, iter + 1, target, n)) 
            || (isValidCoordinate(i + 2, j + 1, n) && board[i + 2][j + 1] == c && foo(board, i + 2, j + 1, iter + 1, target, n))
        ) return true;
        return false;
    }

    static boolean isValidCoordinate(int i, int j, int n) {
        return 0 <= i && i < n && 0 <= j && j < n;
    }
    
}
