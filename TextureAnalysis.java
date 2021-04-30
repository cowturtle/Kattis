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

class TextureAnalysis {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        String s = "";
        int test = 1;
        while (!(s = sc.getWord()).equals("END")) {
            boolean even = true;
            if (s.length() > 3) {
                char[] arr = s.toCharArray();
                int whitecount = 0;
                for (int i = 1; i < arr.length && arr[i] != '*'; i++)
                    whitecount++;
                int testcount = 0;
                for (int i = 1; i < arr.length; i++)
                    if (arr[i] == '*') {
                        if (whitecount != testcount) {
                            even = false;
                            break;
                        }
                        testcount = 0;
                    } else {
                        testcount++;
                    }
            }            
            sb.append(test++);
            sb.append(even ? " EVEN" : " NOT EVEN").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
