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

class FallingApples {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] tmp = br.readLine().split(" ");
        int r = Integer.parseInt(tmp[0]), c = Integer.parseInt(tmp[1]);
        char[][] grid = new char[r][c];
        for (int i = 0; i < r; i++) 
            grid[i] = br.readLine().toCharArray();
        for (int j = 0; j < c; j++) {
            int space = -1;
            for (int i = r - 1; i >= 0; i--) {
                if (space == -1) {
                    if (grid[i][j] == '.') {
                        space = i;
                    }
                } else if (grid[i][j] == '#') {
                    space = -1;
                } else if (grid[i][j] == 'a') {
                    grid[space][j] = 'a';
                    grid[i][j] = '.';
                    space--;
                }
            }
        }
        for (char[] arr : grid)
            out.println(new String(arr));
        out.close();
        br.close();
    }

}
