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

class YingAndYangStones {
    
    public static void main(String[] args) {
        new YingAndYangStones();
    }

    YingAndYangStones() {
        answer();
    }

    void answer() { 
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        int[] arr2 = new int[88];
        for (char c : arr) 
            arr2[c]++;
        System.out.println(arr2[66] == arr2[87] ? 1 : 0);
    }
    
}
