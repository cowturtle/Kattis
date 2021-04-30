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

class Platforme {
    
    public static void main(String[] args) {
        class Platform implements Comparable<Platform> {
            int height, left, right;
            double leftSupport, rightSupport;
            
            public Platform(int height, int left, int right) {
                this.height = height;
                this.left = left;
                this.right = right;
                this.leftSupport = left + 0.5;
                this.rightSupport = right - 0.5;
            }

            public boolean isBetween(double x) {
                return this.left <= x && x <= this.right;
            }

            @Override
            public int compareTo(Platform p) {
                return p.height - this.height;
            }

        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        Platform[] platforms = new Platform[n + 1];
        for (int i = 0; i < n; i++)
            platforms[i] = new Platform(sc.getInt(), sc.getInt(), sc.getInt());
        platforms[n] = new Platform(0, 0, 10000);
        Arrays.sort(platforms);
        int total = 0;
        for (int i = 0; i < n; i++) {
            Platform p = platforms[i];
            boolean left = false, right = false;
            for (int j = i + 1; j < n + 1; j++) {
                Platform o = platforms[j];
                if (o.height == p.height) continue;
                if (!left && o.isBetween(p.leftSupport)) {
                    left = true;
                    total += p.height - o.height;    
                }
                if (!right && o.isBetween(p.rightSupport)) {
                    right = true;
                    total += p.height - o.height;    
                }
                if (left && right) break;
            }
        }
        System.out.println(total);
        sc.close();
    }
    
}
