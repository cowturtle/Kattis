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

class Islands {
    
    private static int r;
    private static int c;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        r = sc.getInt();
        c = sc.getInt();
        char[][] map = new char[r][c];
        boolean[][] visited = new boolean[r][c];
        int count = 0;
        for (int i = 0; i < r; i++)
            map[i] = sc.getWord().toCharArray();
        for (int i = 0; i < r; i++) 
            for (int j = 0; j < c; j++)
                if (map[i][j] == 'L' && !visited[i][j]) {
                    walk(map, visited, i, j);
                    count++;
                }
        System.out.println(count);
        sc.close();
    }

    static void walk(char[][] map, boolean[][] visited, int i, int j) {
        if (!visited[i][j] && (map[i][j] == 'L' || map[i][j] == 'C')) {
            visited[i][j] = true;
            if (isValidRange(i + 1, j))
                walk(map, visited, i + 1, j);
            if (isValidRange(i - 1, j))
                walk(map, visited, i - 1, j);
            if (isValidRange(i, j + 1))
                walk(map, visited, i, j + 1);
            if (isValidRange(i, j - 1))
                walk(map, visited, i, j - 1);
        }
    }

    static boolean isValidRange(int i, int j) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }
    
}
