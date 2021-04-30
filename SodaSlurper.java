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

class SodaSlurper {
    
    public static void main(String[] args) {
        new SodaSlurper();
    }

    SodaSlurper() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int e = sc.getInt(), f = sc.getInt(), c = sc.getInt();
        int empty = e + f, bottles = -1;
        while (empty > 0) {
            empty -= c;
            empty++;
            bottles++;
        }
        System.out.println(bottles == -1 ? 0 : bottles);
        sc.close();
    }
    
}
