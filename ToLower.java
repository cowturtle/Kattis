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

class ToLower {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int p = sc.getInt(), t = sc.getInt();
        int correct = 0;
        while (p-- > 0) {
            int localCorrect = 0;
            for (int i = 0; i < t; i++) {
                boolean pass = true;
                String s = sc.getWord();
                for (int j = 1; j < s.length(); j++)
                    if (Character.isUpperCase(s.charAt(j))) {
                        pass = false;
                        break;
                    }
                if (pass) localCorrect++;
            }
            if (localCorrect == t) correct++;
        }
        System.out.println(correct);
        sc.close();
    }
    
}
