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

class SimpleAddition {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        BigInteger a = new BigInteger(sc.getWord());
        BigInteger b = new BigInteger(sc.getWord());
        System.out.println(a.add(b).toString());
        sc.close();
    }
    
}
