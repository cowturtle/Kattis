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

class GoodMorning {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int[] arr = Arrays.stream(sc.getWord().split("")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
