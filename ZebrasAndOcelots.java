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

class ZebrasAndOcelots {
    
    static final int BINARY_BASE = 2;

    public static void main(String[] args) {
        // A.k.a how to zerorise a binary number e.g. 
        // 010, ZOZ
        // 1001, OZZO
        // 1. 1001 9
        // 2. 1000 8
        // 3. 0111 7 
        // 4. 0110 6
        // 5. 0101 5
        // 6. 0100 4
        // 7. 0011 3 
        // 8. 0010 2
        // 9. 0001 1
        // 10. 0000 0
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        char[] magic = new char[n];
        for (int i = 0; i < n; i++)
            magic[i] = sc.getWord().charAt(0) == 'Z' ? '0' : '1';
        System.out.println(Long.parseLong(new String(magic), BINARY_BASE)); // n = 60, integer max val 2^31 - 1
        sc.close();
    }
    
}
