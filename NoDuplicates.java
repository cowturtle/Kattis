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

class NoDuplicates {
    
    public static void main(String[] args) {
        new NoDuplicates();
    }

    NoDuplicates() {
        answer();
    }

    void answer() {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        java.util.Arrays.sort(arr);
        System.out.println(check(arr) ? "yes" : "no");
    }   

    boolean check(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                return false;
            }
        }
        return true;
    }
 
}
