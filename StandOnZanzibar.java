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

class StandOnZanzibar {
    
    public static void main(String[] args) {
        new StandOnZanzibar();
    }

    StandOnZanzibar() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int next = 0, prev = 1, imported = 0;
            while ((next = sc.getInt()) != 0) {
                imported += (int) Math.max(0, next - (prev * 2));
                prev = next;
            }
            sb.append(imported).append("\n");
        }
        System.out.println(sb.toString());        
        sc.close();
    }
}
