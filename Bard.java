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

class Bard {
    
    public static void main(String[] args) {
        new Bard();
    }

    Bard() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt(), e = sc.getInt(), songCount = 1;

        int[] know = new int[n + 1]; // 0 not a villager
        
        while (e-- > 0) {
            int k = sc.getInt();
            int[] tmp = new int[k];
            for (int i = 0; i < k; i++)
                tmp[i] = sc.getInt();
            Arrays.sort(tmp);
            if (tmp[0] == 1) {
                songCount++;
                for (int i : tmp)
                    know[i]++;
            } else {
                for (int i : tmp)
                    know[i] = songCount;
            }
        }
        sb.append(1).append("\n");
        for (int i = 2; i < n + 1; i++)
            if (know[i] == songCount) sb.append(i).append("\n");
        System.out.println(sb.toString());
        sc.close();
    }
    
}
