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

class MeowFactor {

    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        BigInteger n = new BigInteger(s);
        int start = 127;
        for (; start > 1; start--)
            if (n.mod(BigInteger.valueOf(start).pow(9)).equals(BigInteger.ZERO)) break;
        System.out.println(start);
    }

}
