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

class GettingGold {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int c = sc.getInt(), r = sc.getInt();
        char[][] map = new char[r][c];
        boolean[][] visited = new boolean[r][c];
        int[] player = new int[2];
        readMap(map, player, sc, r, c);
        System.out.println(play(map, visited, player[0], player[1], r, c));
        sc.close();
        
    }

    static int play(char[][] map, boolean[][] visited, int i, int j, int r, int c) {
        int gold = 0;
        if (!visited[i][j]) {
            visited[i][j] = true;
            if (map[i][j] == 'T' || map[i][j] == '#') return 0;
            if (map[i][j] == 'G') gold += 1;
            int leftx = i, lefty = j - 1;
            int rightx = i, righty = j + 1;
            int upx = i - 1, upy = j;
            int downx = i + 1, downy = j;
            boolean inLeft = isInMap(leftx, lefty, r, c);
            boolean inRight = isInMap(rightx, righty, r, c);
            boolean inUp = isInMap(upx, upy, r, c);
            boolean inDown = isInMap(downx, downy, r, c);
            if ((inLeft && map[leftx][lefty] == 'T') 
                || (inRight && map[rightx][righty] == 'T')
                || (inUp && map[upx][upy] == 'T')
                || (inDown && map[downx][downy] == 'T')) return gold;
            gold += (inLeft ? play(map, visited, leftx, lefty, r, c) : 0) 
                    + (inRight ? play(map, visited, rightx, righty, r, c) : 0)
                    + (inUp ? play(map, visited, upx, upy, r, c) : 0)
                    + (inDown ? play(map, visited, downx, downy, r, c) : 0);
        }        
        return gold;
    }

    static boolean isInMap(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

    static void readMap(char[][] map, int[] player, Kattio sc, int r, int c) {
        for (int i = 0; i < r; i++) {
            char[] arr = sc.getWord().toCharArray();
            for (int j = 0; j < c; j++) {
                map[i][j] = arr[j];
                if (arr[j] == 'P') {
                    player[0] = i;
                    player[1] = j;
                }
            }
        }
    }

}
