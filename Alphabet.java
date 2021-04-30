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

class Alphabet {
    
    public static void main(String[] args) {
        char[] original = new java.util.Scanner(System.in).nextLine().toCharArray();
        char[] target = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println(26 - lcs(original, target, original.length, target.length));
    }

    // Longest common subsequence, i couldnt achieve the recursive soln
    static int lcs(char[] one, char[] two, int lenone, int lentwo) {
        int[][] mtx = new int[lenone + 1][lentwo + 1];
        for (int i = 1; i < lenone + 1; i++) {
            for (int j = 1; j < lentwo + 1; j++) {
                if (one[i - 1] == two[j - 1]) {
                    mtx[i][j] = 1 + mtx[i - 1][j - 1];
                } else {
                    mtx[i][j] = Math.max(mtx[i - 1][j], mtx[i][j - 1]);
                }
            }
        }
        return mtx[lenone][lentwo];
    }
    
}

