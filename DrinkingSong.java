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

class DrinkingSong {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        String s = sc.getWord();
        while (n > 0) {
            if (n == 1) {
                System.out.printf("1 bottle of %s on the wall, 1 bottle of %s.\n", s, s);
            } else {
                System.out.printf("%d bottles of %s on the wall, %d bottles of %s.\n", n, s, n, s);
            }
            
            n--;
            if (n == 1) {
                System.out.printf("Take one down, pass it around, 1 bottle of %s on the wall.\n", s);
            } else if (n == 0) {
                System.out.printf("Take it down, pass it around, no more bottles of %s.\n", s);
            } else {
                System.out.printf("Take one down, pass it around, %d bottles of %s on the wall.\n", n, s);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
