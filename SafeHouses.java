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

class SafeHouses {
    
    public static void main(String[] args) {

        class Point {
            int x, y;
            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            int distanceTo(Point p) {
                // manhatten distance
                return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
            }
        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), max = 0;
        char[][] grid = new char[n][n];
        ArrayList<Point> houses = new ArrayList<>();
        ArrayList<Point> spies = new ArrayList<>();
        for (int i = 0; i < n; i++)
            grid[i] = sc.getWord().toCharArray();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 'H') {
                    houses.add(new Point(i, j));
                } else if (grid[i][j] == 'S') {
                    spies.add(new Point(i, j));
                }
        for (Point s : spies) {
            int min = Integer.MAX_VALUE;
            for (Point h : houses)
                min = Math.min(min, s.distanceTo(h));
            max = Math.max(max, min);
        }
        System.out.println(max);
        sc.close();
    }
    
}
