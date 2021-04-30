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

class PathTracing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        char[][] grid = new char[2000][2000];
        int x = 1000, y = 1000;
        int maxx = x, minx = x, maxy= y, miny = y;
        grid[x][y] = 'S';
        String s = "";
        while ((s = br.readLine()) != null) {
            char m = s.charAt(0);
            if (m == 'u') {
                x--;
            } else if (m == 'd') {
                x++;
            } else if (m == 'l') {
                y--;
            } else if (m == 'r') {
                y++;
            }
            maxx = Math.max(x, maxx);
            minx = Math.min(x, minx);
            maxy = Math.max(y, maxy);
            miny = Math.min(y, miny);
            grid[x][y] = '*';
        }
        grid[x][y] = 'E';
        grid[1000][1000] = 'S';
        for (int i = miny - 1; i <= maxy + 1; i++)
            out.print('#');
        out.println();
        for (int i = minx; i <= maxx; i++) {
            out.print('#');
            for (int j = miny; j <= maxy; j++) 
                out.print(grid[i][j] == '\u0000' ? ' ' : grid[i][j]);
            out.print('#');
            out.println();
        }
        for (int i = miny - 1; i <= maxy + 1; i++)
            out.print('#');
        out.println();
        out.close();
        br.close();
    }

}
