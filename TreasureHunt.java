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

class TreasureHunt {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt();
        char[][] area = new char[r][c];
        for (int i = 0; i < r; i++)
            area[i] = sc.getWord().toCharArray();
        int x = 0, y = 0, moves = 0;
        while (true) {
            if (!checkValid(x, y, r, c)) {
                moves = -1;
                break;
            }
            char move = area[x][y];
            area[x][y] = 'Z';
            if (move == 'N') {
                x--;
            } else if (move == 'S') {
                x++;
            } else if (move == 'W') {
                y--;
            } else if (move == 'E') {
                y++;
            } else if (move == 'T') {
                break;
            } else if (move == 'Z') {
                moves = -2;
                break;
            }
            moves++;
        }
        System.out.println(moves == -1 ? "Out" : moves == -2 ? "Lost" : moves);
        sc.close();
    }

    static boolean checkValid(int x, int y, int r, int c) {
        return 0 <= x && x < r && 0 <= y && y < c;
    }

}
