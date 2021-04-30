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

class Kolone {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        sc.getInt();
        sc.getInt();
        char[] left = reverse(sc.getWord().toCharArray()), right = sc.getWord().toCharArray();
        int n = sc.getInt();
        int leftants = left.length;
        int rightants = right.length;
        int totalants = leftants + rightants;
        char[][] ants = new char[totalants][1];
        int i = 0;
        for (; i < leftants; i++) 
            ants[i] = new char[] {left[i], 'l'};
        for (; i < totalants; i++) 
            ants[i] = new char[] {right[i - leftants], 'r'};
        while (n-- > 0) {
            for (int j = 0; j < totalants - 1; j++) {
                if (ants[j][1] == 'l' && ants[j + 1][1] == 'r') {
                    char[] tmp = ants[j];
                    ants[j] = ants[j + 1];
                    ants[j + 1] = tmp;
                    j++;
                }
            }
        }
        String s = "";
        for (char[] arr : ants)
            s += arr[0];
        System.out.println(s);
        sc.close();
    }

    static char[] reverse(char[] arr) {
        char[] arr2 = new char[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) 
            arr2[--j] = arr[i];
        return arr2;
    }
    
}
