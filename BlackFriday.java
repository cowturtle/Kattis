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

class BlackFriday {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] players = new int[n];
        int[] distinct = new int[7];
        for (int i = 0; i < n; i++) {
            int x = sc.getInt();
            players[i] = x;
            distinct[x]++;
        }
        int unique = -1;
        for (int i = 6; i > 0; i--) 
            if (distinct[i] == 1) {
                unique = i;
                break;
            }
        if (unique == -1) {
            System.out.println("none");    
        } else {
            for (int i = 0; i < n; i++)
                if (players[i] == unique) {
                    unique = i + 1;
                    break;
                }
            System.out.println(unique);
        }
        sc.close();        
    }
    
}
