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

class Backspace {
    
    public static void main(String[] args) {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        int sblen = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '<') {
                sb.deleteCharAt(--sblen);
            } else {
                sb.append(arr[i]);
                sblen++;
            }
        }
        System.out.println(sb.toString());            
    }
    
}
