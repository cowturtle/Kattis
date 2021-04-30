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

class Parking {
    
    public static void main(String[] args) {
        new Parking();
    }

    Parking() {
        answer();
    }

    void answer() {     
        Kattio sc = new Kattio(System.in);
        int total = 0, a = sc.getInt(), b = sc.getInt() * 2, c = sc.getInt() * 3;
        int[] time = new int[101];
        int s1 = sc.getInt(), e1 = sc.getInt(), 
            s2 = sc.getInt(), e2 = sc.getInt(),
            s3 = sc.getInt(), e3 = sc.getInt();
        addTime(s1, e1, time);
        addTime(s2, e2, time);
        addTime(s3, e3, time);
        for (int i = 1; i < time.length; i++) {
            if (time[i] == 0) continue;
            if (time[i] == 1) {
                total += a;
            } else if (time[i] == 2) {
                total += b;
            } else if (time[i] == 3) {
                total += c;
            }
        }
        System.out.println(total);
        sc.close();
    }

    void addTime(int s, int e, int[] time) {
        for (int i = s; i < e; i++) 
            time[i]++;
    } 
    
}
