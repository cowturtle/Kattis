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

class JumbledCompass {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int t1 = sc.getInt(), t2 = sc.getInt();
        int clockwise = (360 - t1 + t2) % 360, anticlockwise = 360 - clockwise;
        if (clockwise <= anticlockwise) {
            System.out.println(clockwise);
        } else {
            System.out.println(-anticlockwise);
        }
        sc.close();
    }
    
}
