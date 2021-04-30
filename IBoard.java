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

class IBoard {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            boolean leftone = false, rightzero = false;
            for (char c : arr) 
                for (int i = 0; i < 7; i++) {
                    if (c % 2 == 0) {
                        rightzero = !rightzero;
                    } else {
                        leftone = !leftone;
                    }
                    c /= 2;
                }
            sb.append(rightzero || leftone ? "trapped" : "free").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
