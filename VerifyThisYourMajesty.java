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

class VerifyThisYourMajesty {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        boolean[][] board = new boolean[n][n];
        for (int i = 0; i < n; i++)
            board[sc.getInt()][sc.getInt()] = true;
        System.out.println(solve(board, n) ? "CORRECT" : "INCORRECT");
        sc.close();
    }   

    static boolean solve(boolean[][] board, int n) {
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n ; j++)
                if (board[i][j] && !check(board, i, j, n)) return false;
        return true;
    }

    static boolean check(boolean[][] board, int i, int j, int n) {
        return checkHorizontal(board, i, j, n) 
                && checkVertical(board, i, j, n)
                && checkRightDiagonal(board, i, j, n)
                && checkLeftDiagonal(board, i, j, n);
    }

    static boolean checkHorizontal(boolean[][] board, int i, int j, int n) {
        for (int jj = 0; jj < n; jj++)
            if (jj != j && board[i][jj]) return false;
        return true;
    }

    static boolean checkVertical(boolean[][] board, int i, int j, int n) {
        for (int ii = 0; ii < n; ii++)
            if (ii != i && board[ii][j]) return false;
        return true;
    }

    static boolean checkRightDiagonal(boolean[][] board, int i, int j, int n) {
        int ii = i + 1, jj = j - 1;
        while (isValidRange(ii, jj, n)) {
            if (i != ii && j != jj && board[ii][jj]) return false;
            ii++;
            jj--;
        }
        ii = i - 1;
        jj = j + 1;
        while (isValidRange(ii, jj, n)) {
            if (i != ii && j != jj && board[ii][jj]) return false;
            ii--;
            jj++;
        }
        return true;
    }

    static boolean checkLeftDiagonal(boolean[][] board, int i, int j, int n) {
        int ii = i - 1, jj = j - 1;
        while (isValidRange(ii, jj, n)) {
            if (i != ii && j != jj && board[ii][jj]) return false;
            ii--;
            jj--;
        }
        ii = i + 1;
        jj = j + 1;
        while (isValidRange(ii, jj, n)) {
            if (i != ii && j != jj && board[ii][jj]) return false;
            ii++;
            jj++;
        }
        return true;
    }
    
    static boolean isValidRange(int i, int j, int n) {
        return 0 <= i && i < n && 0 <= j && j < n;
    }

}
