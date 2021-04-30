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

class TheBackslashProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            while (n-- > 0) 
                s = s.replace("\\", "\\\\")
                        .replace("!", "\\!")
                        .replace("\"", "\\\"")
                        .replace("#", "\\#")
                        .replace("$", "\\$")
                        .replace("%", "\\%")
                        .replace("&", "\\&")
                        .replace("'", "\\'")
                        .replace("(", "\\(")
                        .replace(")", "\\)")
                        .replace("*", "\\*")
                        .replace("[", "\\[")
                        .replace("]", "\\]");
            sb.append(s).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
