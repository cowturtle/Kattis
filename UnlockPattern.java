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

class UnlockPattern {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) 
                arr[i][j] = sc.getInt();            
        int steps = 1;
        double dist = 0;
        while (steps < 9) {
            int currx = 0, curry = 0, nextx = 0, nexty = 0;
            for (int i = 0; i < 3; i++) 
                for (int j = 0; j < 3; j++) 
                    if (arr[i][j] == steps) {
                        currx = i;
                        curry = j;
                    } else if (arr[i][j] == steps + 1) {
                        nextx = i;
                        nexty = j;
                    }
            if (currx == nextx) {
                dist += Math.abs(curry - nexty);
            } else if (curry == nexty) {
                dist += Math.abs(currx - nextx);
            } else {
                dist += euclidean(currx, curry, nextx, nexty);
            }
            steps++;
        }
        System.out.println(dist);
        sc.close();
    }

    static double euclidean(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    
}
