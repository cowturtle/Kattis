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

class MirrorImages {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        for (int t = 1; t <= n; t++) {
            int r = sc.getInt(), c = sc.getInt();
            char[][] matrix = new char[r][c];
            for (int i = 0; i < r; i++) 
                matrix[i] = sc.getWord().toCharArray();
            
            // Left to right
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c / 2; j++) {
                    char tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][c - 1 - j];
                    matrix[i][c - 1 - j] = tmp;
                }
            }

            // Top to bottom
            for (int i = 0; i < r / 2; i++) {
                for (int j = 0; j < c; j++) {
                    char tmp = matrix[i][j];
                    matrix[i][j] = matrix[r - 1 - i][j];
                    matrix[r - 1 - i][j] = tmp;
                }
            }   

            sb.append("Test " + t).append("\n");
            for (int i = 0; i < r; i++)
                sb.append(new String(matrix[i])).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
