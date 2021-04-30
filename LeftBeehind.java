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

class LeftBeehind {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int x = sc.getInt(), y = sc.getInt();
            if (x == 0 && y == 0) {
                break;
            } else if (x + y == 13) {
                sb.append("Never speak again.");
            } else if (x > y) {
                sb.append("To the convention.");
            } else if (y > x) {
                sb.append("Left beehind.");
            } else {
                sb.append("Undecided.");
            }
            sb.append("\n");
        } 
        System.out.println(sb.toString());
        sc.close();
    }
    
}
