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

class WizardOfOdds {
    
    public static void main(String[] args) {
        // probability tree height
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        BigInteger n = new BigInteger(arr[0]);
        BigInteger k = new BigInteger(arr[1]);
        System.out.println(BigInteger.valueOf(2).pow(k.intValue()).compareTo(n) >= 0 ? "Your wish is granted!" : "You will become a flying monkey!");
    }
    
}
