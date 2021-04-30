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

class BossBattle {
    
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        // 1 1
        // 2 1
        // 3 1
        // 4 2
        // 5 3
        // 6 4
        // 7 5
        System.out.println(n <= 3 ? 1 : n - 2);
    }
    
}
