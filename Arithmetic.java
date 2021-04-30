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

class Arithmetic {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String s = sc.getWord();
        BigInteger n = new BigInteger(s, 8);
        System.out.println(n.toString(16));
        sc.close();
    }
    
}
