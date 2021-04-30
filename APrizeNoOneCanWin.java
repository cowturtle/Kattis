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

class APrizeNoOneCanWin {
    
    public static void main(String[] args) {
        new APrizeNoOneCanWin();
    }

    APrizeNoOneCanWin() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), min = sc.getInt(), x = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.getInt();
        Arrays.sort(arr); // Ascending order VERY impt
        if (n == 1) { // Need minimum two, doesn't matter cost
            x = 1;
        } else if (arr[arr.length - 1] + arr[arr.length - 2] <= min) { // Top 2 sum smaller than m, the rest xfm smaller than m
            x = n;
        } else { // iterate through the rest, if the sum is bigger than m, break;
            for (int i = 0; i < arr.length - 1; i++)
                if (arr[i] + arr[i + 1] > min) {
                    x = i + 1; // because i started from 0
                    break;
                }
        }        
        System.out.println(x);
        sc.close();
    }

}
