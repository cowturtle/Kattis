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

class Sjecista {
    
    public static void main(String[] args) {
        new Sjecista();
    }

    Sjecista() {
        answer();
    }

    void answer() {    
        System.out.println(intersections(new java.util.Scanner(System.in).nextInt()));
    }

    int intersections(int n) { 
        return ((int) (Math.pow(n, 4) - (6 * Math.pow(n, 3)) + (11 * Math.pow(n, 2)) - (6 * n))) / 24;
    }

}
