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

class EspressoBucks {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        char[][] map = new char[n][m];
        boolean[][] filled = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            char[] tmp = sc.getWord().toCharArray();
            for (int j = 0; j < m; j++) {
                map[i][j] = tmp[j];
                if (tmp[j] == '#') filled[i][j] = true;
            }
        }
        solve(map, filled);
        print(map);
        sc.close();
    }

    static void solve(char[][] map, boolean[][] filled) {
        for (int i = 0; i < filled.length; i++) {
            for (int j = 0; j < filled[i].length; j++) {
                if (!filled[i][j]) {
                    fill(filled, i, j);
                    fill(filled, i + 1, j);
                    fill(filled, i - 1, j);
                    fill(filled, i, j + 1);
                    fill(filled, i, j - 1);
                    map[i][j] = 'E';
                }
            }
        }
    }

    static void fill(boolean[][] filled, int i, int j) {
        if (0 <= i && i < filled.length && 0 <= j && j < filled[0].length) 
            filled[i][j] = true;
    }

    static void print(char[][] map) {
        for (int i = 0; i < map.length; i++)
            System.out.println(Arrays.toString(map[i]).replaceAll("[\\[\\],\\s]", ""));
    }
    
}
