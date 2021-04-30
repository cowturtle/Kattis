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

class ReverseRot {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        char[] target = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".toCharArray();
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            char[] arr = sc.getWord().toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                int c = 0;
                if (arr[i] == '_') {
                    c = (26 + n) % 28;
                } else if (arr[i] == '.') {
                    c = (27 + n) % 28;
                } else {
                    c = ((arr[i] - 65) + n) % 28;
                }                
                sb.append(target[c]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

