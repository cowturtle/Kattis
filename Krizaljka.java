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

class Krizaljka {
    
    public static void main(String[] args) {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        String a = arr[0], b = arr[1];
        int alen = a.length(), blen = b.length();
        int aind = -1, bind = -1;
        for (int i = 0; i < alen; i++)
            if (b.contains(String.valueOf(a.charAt(i)))) {
                aind = i;
                bind = b.indexOf(a.charAt(i));
                break;
            }
        for (int j = 0; j < blen; j++) {
            for (int i = 0; i < alen; i++) {
                if (i == aind) {
                    System.out.print(b.charAt(j));
                } else if (j == bind) {
                    System.out.print(a.charAt(i));
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }        
    }
    
}
