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

class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        new Apaxiaaaaaaaaaaaans();
    }

    Apaxiaaaaaaaaaaaans() {
        answer();
    }

    void answer() {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        String s = String.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (s.charAt(s.length() - 1) != arr[i]) {
                s += String.valueOf(arr[i]);
            }
        }        
        System.out.println(s);
    }
}
