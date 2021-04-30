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

class Tajna {
    
    public static void main(String[] args) {
        new Tajna();
    }

    Tajna() {
        answer();
    }

    void answer() { 
        String s = new java.util.Scanner(System.in).nextLine();
        int[] d = find(s.length());
        char[][] matrix = new char[d[0]][d[1]];
        int x = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = s.charAt(x++); 
                
            }
        }
        String xs = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                xs += String.valueOf(matrix[i][j]); 
            }
        }
        System.out.println(xs);
    }

    int[] find(int n) {
        int row = n, col = 0;
        for (; row >= 1; row--) {
            if (n % row == 0) {
                col = n / row;
                if (row <= col) break;
            }
        }
        return new int[] {row, col};
    }
    
}
