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

class Semafori {
    
    public static void main(String[] args) {
        new Semafori();
    }

    Semafori() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int time = 0, prevD = 0, n = sc.getInt(), l = sc.getInt();
        while (n-- > 0) {
            int d = sc.getInt(), r = sc.getInt(), g = sc.getInt();

            int temp = d;
            d -= prevD;
            prevD = temp;

            time += d;

            temp = 0;
            boolean red = true;
            while (time >= temp) {
                if (red) {
                    temp += r;
                    red = false;
                } else {
                    temp += g;
                    red = true;
                }
            }

            if (!red) {
                time = temp;
            }
        }
        time += l - prevD;
        System.out.println(time); 
        sc.close();
    }

}
