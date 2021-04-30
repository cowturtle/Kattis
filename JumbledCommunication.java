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

class JumbledCommunication {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < 256; i++) 
            hmap.put((i ^ (i << 1)) % 256, i);
        int n = sc.getInt();
        while (n-- > 0) 
            System.out.printf("%d ", hmap.get(sc.getInt()));
        sc.close();
    }
    
}
