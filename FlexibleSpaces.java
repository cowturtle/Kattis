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

class FlexibleSpaces {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int w = sc.getInt(), p = sc.getInt();
        int[] partitions = new int[p];
        boolean[] width = new boolean[w + 1];
        width[w] = true;
        for (int i = 0; i < p; i++)
            partitions[i] = sc.getInt();
        for (int i = 0; i < p; i++) {
            width[partitions[i]] = true;
            width[w - partitions[i]] = true;
            for (int j = i + 1; j < p; j++) 
                width[partitions[j] - partitions[i]] = true;
        }
        for (int i = 1; i < w + 1; i++)
            if (width[i]) System.out.print(i + " ");
        sc.close();   
    }
    
}
