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

class Perket {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        ArrayList<Integer> sour = new ArrayList<>();
        ArrayList<Integer> bitter = new ArrayList<>();
        int n = sc.getInt();
        for (int i = 0; i < n; i++) {
            sour.add(sc.getInt());
            bitter.add(sc.getInt());
        }
        int combinations = (int) Math.pow(2, n);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < combinations; i++) {
            boolean[] combination = getCombination(i, n);
            min = Math.min(min, getMin(combination, sour, bitter));
        }
        System.out.println(min);
        sc.close();
    }

    static int getMin(boolean[] combination, ArrayList<Integer> sour, ArrayList<Integer> bitter) {
        int sourTotal = 1, bitterTotal = 0;
        for (int i = 0; i < combination.length; i++) {
            if (combination[i]) {
                sourTotal *= sour.get(i);
                bitterTotal += bitter.get(i);
            }
        }
        return Math.abs(sourTotal - bitterTotal);
    }

    static boolean[] getCombination(int i, int n) {
        boolean[] arr = new boolean[n];
        int j = 0;
        for (; i > 0; i /= 2) 
            arr[j++] = i % 2 == 1;
        return arr;
    }
    
}
