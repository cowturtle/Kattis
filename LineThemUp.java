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

class LineThemUp {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        String[] original = new String[n];
        for (int i = 0; i < n; i++)
            original[i] = sc.getWord();
        boolean ascend = false, descend = false;
        for (int i = 0; i < original.length - 1; i++) {
            int com = original[i].compareTo(original[i + 1]);
            if (com > 0) {
                descend = true;
            } else if (com < 0) {
                ascend = true;
            }
            if (ascend && descend) break;
        }

        if (ascend && descend) {
            System.out.println("NEITHER");
        } else if (descend) {
            System.out.println("DECREASING");
        } else if (ascend) {
            System.out.println("INCREASING");
        } 
        sc.close();
    }  

}
