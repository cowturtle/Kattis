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

class Geppetto {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        int total = 1 << n, pizzas = 0; 
        HashSet<Integer> set = new HashSet<>();
        while (m-- > 0)
            set.add(twoPowers(sc.getInt()) + twoPowers(sc.getInt())); // disallowed combis as binary
        for (int i = 0; i < total; i++) 
            if (validPizza(set, i)) pizzas++; 
        System.out.println(pizzas);
        sc.close();
    }

    static int twoPowers(int n) {
        return (1 << n) >> 1;
    }

    static boolean validPizza(HashSet<Integer> set, int i) {
        // & operator will surface those 1s that are similar. 
        // if they result in the disallowed pizza. cancel this pizza;
        for (Integer j : set)
            if ((i & j) == j) return false; 
        return true;
    }

}
