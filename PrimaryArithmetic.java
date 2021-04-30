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

class PrimaryArithmetic {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int x = sc.getInt(), y = sc.getInt();
            if (x == 0 && y == 0) break;
            int count = foo(x, y);
            if (count == 0) {
                sb.append("No carry operation.");
            } else if (count == 1) {
                sb.append("1 carry operation.");
            } else {
                sb.append(count).append(" carry operations.");
            }
            sb.append("\n");
        } 
        System.out.print(sb.toString());
        sc.close();
    }

    static int foo(int x, int y) {
        int count = 0, carry = 0;
        while (x > 0 || y > 0) {
            int digitSum = x % 10 + y % 10 + carry;
            x /= 10;
            y /= 10;
            if (digitSum > 9) {
                count++;
                carry = 1;
            } else {
                carry = 0;
            }
        }
        return count;
    }
    
}
