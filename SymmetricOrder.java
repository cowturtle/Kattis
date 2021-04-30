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

class SymmetricOrder {
    
    public static void main(String[] args) {
        new SymmetricOrder();
    }

    SymmetricOrder() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuffer sb = new StringBuffer();
        int n = 0, i = 1;
        while ((n = sc.getInt()) != 0) {
            
            String[] arr = new String[n];
            for (; n > 0; n--) {
                arr[arr.length - n] = sc.getWord();
            }
            sb.append("SET");
            sb.append(" ");
            sb.append(i++);
            sb.append("\n");
            
            for (int x = 0; x < arr.length; x += 2) {
                sb.append(arr[x]);
                sb.append("\n");
            } 
            for (int x = arr.length % 2 == 0 ? arr.length - 1 : arr.length - 2; x > -1; x -= 2) {
                sb.append(arr[x]);
                sb.append("\n");
            }
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }

}
