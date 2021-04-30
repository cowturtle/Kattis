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

class Relocation {
    
    public static void main(String[] args) {
        new Relocation();
    }

    Relocation() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.getInt(), q = sc.getInt();
        
        HashMap<Integer, Integer> companies = new HashMap<>();
        for (int i = 1; i <= n; i++)
            companies.put(i, sc.getInt());
        
        while (q-- > 0) {
            int num = sc.getInt();
            if (num == 1) {
                companies.put(sc.getInt(), sc.getInt());
            } else {
                sb.append(Math.abs(companies.get(sc.getInt()) - companies.get(sc.getInt()))).append("\n");
            }
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }

}
