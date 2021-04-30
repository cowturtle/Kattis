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

class GuessTheNumber {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int x = (1 + 1000) / 2;
        System.out.println(x);
        String ans = sc.getWord();
        int lbound = 1, ubound = 1000;
        while (!ans.equals("correct")) {
            if (ans.equals("lower")) {
                ubound = x;
                x = (lbound + ubound) / 2;
            } else {
                lbound = x;
                x = (lbound + ubound + 1) / 2;
            }
            System.out.println(x);
            ans = sc.getWord();
        }
        sc.close();
    }
    
}
