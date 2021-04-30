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

class ASCIIFigureRotation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while ((n = Integer.parseInt(sc.nextLine())) != 0) {
            String[] drawing = new String[n];
            int maxlen = 0;
            for (int i = 0; i < n; i++) {
                drawing[i] = sc.nextLine();
                if (drawing[i].length() > maxlen) 
                    maxlen = drawing[i].length();
            }
            for (int j = 0; j < maxlen; j++) {
                String s = "";
                for (int i = drawing.length - 1; i >= 0; i--) {
                    if (j > drawing[i].length() - 1) {
                        s += ' ';
                    } else {
                        s += swap(drawing[i].charAt(j));
                    }
                }    
                sb.append(removeTrailingWhites(s)).append("\n");    
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().substring(0, sb.length() - 2));
        sc.close();
    }

    static String removeTrailingWhites(String s) {
        int i = s.length() - 1;
        while (s.charAt(i) == 0 || s.charAt(i) == ' ') i--;
        return s.substring(0, i + 1);
    }

    static char swap(char c) {
        if (c == '-') return '|';
        if (c == '|') return '-';
        return c;
    }
    
}
