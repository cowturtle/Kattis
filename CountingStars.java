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

class CountingStars {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;
        while (sc.hasMoreTokens()) {
            int r = sc.getInt(), c = sc.getInt();
            char[][] sky = new char[r][c];
            boolean[][] visited = new boolean[r][c];
            for (int i = 0; i < r; i++)
                sky[i] = sc.getWord().toCharArray();
            int stars = 0;
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    if (!visited[i][j] && sky[i][j] == '-') {
                        findStars(sky, visited, i, j, r, c);
                        stars++;
                    }
            out.printf("Case %d: %d\n", t++, stars);
        }
        out.close();
        sc.close();
    }

    static void findStars(char[][] sky, boolean[][] visited, int i, int j, int r, int c) {
        if (!visited[i][j]) {
            visited[i][j] = true;
            if (inImage(i + 1, j, r, c) && sky[i + 1][j] == '-') 
                findStars(sky, visited, i + 1, j, r, c);
            if (inImage(i - 1, j, r, c) && sky[i - 1][j] == '-') 
                findStars(sky, visited, i - 1, j, r, c);
            if (inImage(i, j + 1, r, c) && sky[i][j + 1] == '-') 
                findStars(sky, visited, i, j + 1, r, c);
            if (inImage(i, j - 1, r, c) && sky[i][j - 1] == '-') 
                findStars(sky, visited, i, j - 1, r, c);
        }
        
    }

    static boolean inImage(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}
