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

class TenKindsOfPeople {
    
    public static void main(String[] args) {
        new TenKindsOfPeople();
    }

    TenKindsOfPeople() {
        answer();
    }

    void answer() { 
        Kattio sc =  new Kattio(System.in);
        char[][] map = readMap(sc);
        int[][] routes = mapRoutes(map);
        System.out.println(processQueries(sc, map, routes));
        // sc.close();
    }

    String processQueries(Kattio sc, char[][] map, int[][] routes) {
        int n = sc.getInt();
        StringBuffer sb = new StringBuffer();

        while (n-- > 0) {
            int r1 = sc.getInt() - 1, c1 = sc.getInt() - 1;
            int r2 = sc.getInt() - 1, c2 = sc.getInt() - 1;

            if (routes[r1][c1] == routes[r2][c2]) {
                sb.append(map[r1][c1] == '0' ? "binary" : "decimal");
            } else {
                sb.append("neither");
            }

            sb.append("\n");
        }

        return sb.toString().trim();
    }
 
    int[][] mapRoutes(char[][] map) {
        int[][] routes = new int[map.length][map[0].length];
        int fill = 2;

        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                if (routes[i][j] == 0) {
                    BreathFirstSearch(new Point(i,j), map, routes, fill);
                    fill++;
                }
            }
        }

        return routes;
    }

    void BreathFirstSearch(Point start, char[][] map, int[][] routes, int fill) {
        Queue<Point> queue = new PriorityQueue<>();
        queue.add(start);
        routes[start.r][start.c] = fill;

        int[] testR = {1, -1, 0, 0};
        int[] testC = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            Point curr = queue.poll();
            int r = curr.r, c = curr.c;

            for (int i = 0; i < 4; i++) {
                int R = r + testR[i];
                int C = c + testC[i];
                
                if ((0 <= R && R < map.length)
                    && (0 <= C && C < map[0].length)
                    && map[R][C] == map[r][c]
                    && routes[R][C] != fill) {
                        routes[R][C] = fill;
                        queue.add(new Point(R, C));
                    }
            }
        }
    }

    char[][] readMap(Kattio sc) {
        char[][] map = new char[sc.getInt()][sc.getInt()];

        for (int i = 0; i < map.length; i++) 
            map[i] = sc.getWord().toCharArray();

        return map;
    }

}

class Point implements Comparable<Point>{
    int r, c;
    Point(int r, int c) { this.r = r; this.c = c; }

    @Override
    public int compareTo(Point p) {
        return (this.r - p.r) + (this.c - p.c);
    }
}
