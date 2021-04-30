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

class CharacterDevelopment {
    
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        // power set size = 2^n.
        // -x to remove singular sets
        // -1 for empty set
        System.out.println((int) Math.pow(2, x) - x - 1);
    }
    
}
