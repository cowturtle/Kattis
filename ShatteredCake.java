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

class ShatteredCake {
    
    public static void main(String[] args) {
        new ShatteredCake();
    }

    ShatteredCake() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int w = sc.getInt(), n = sc.getInt(), area = 0; 
        while (n-- > 0) {
            area += sc.getInt() * sc.getInt();
        }
        System.out.println(area / w);
        // sc.close();
    }

}
