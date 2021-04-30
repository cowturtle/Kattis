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

class ConquestCampaign {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt(), n = sc.getInt();
        int[][] map = new int[r][c];
        for (int i = 0; i < n; i++)
            map[sc.getInt() - 1][sc.getInt() - 1] = 1;
        System.out.println(conquer(map, r, c));
        sc.close();
    }

    static int conquer(int[][] map, int r, int c) {
        boolean win = false;
        int days = 0;
        while (!win) {
            win = true;
            days++;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++)
                    if (map[i][j] == days) {
                        if (withinMap(i + 1, j, r, c) && map[i + 1][j] == 0) map[i + 1][j] = days + 1;
                        if (withinMap(i - 1, j, r, c) && map[i - 1][j] == 0) map[i - 1][j] = days + 1;
                        if (withinMap(i, j + 1, r, c) && map[i][j + 1] == 0) map[i][j + 1] = days + 1;
                        if (withinMap(i, j - 1, r, c) && map[i][j - 1] == 0) map[i][j - 1] = days + 1;
                        win = false;
                    }
            }      
        }
        return --days;
    }

    static boolean withinMap(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}
