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

class IHateTheNumberNine {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        BigInteger eight = BigInteger.valueOf(8);
        BigInteger nine = BigInteger.valueOf(9);
        BigInteger modFactor = BigInteger.valueOf(1000000007);
        int n = sc.getInt();
        while (n-- > 0) 
            sb.append(eight.multiply(nine.modPow(BigInteger.valueOf(sc.getLong()).subtract(BigInteger.ONE), modFactor)).mod(modFactor)).append("\n");
        System.out.print(sb.toString());
        sc.close();    
    }
    
}
