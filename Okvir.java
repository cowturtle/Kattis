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

class Okvir {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int m = sc.getInt(), n = sc.getInt();
        int u = sc.getInt(), l = sc.getInt(), r = sc.getInt(), d = sc.getInt();
        int bigR = m + d + u, bigC = n + l + r;
        char[][] mtx = new char[bigR][bigC];
        String one = "", two = "";
        for (int i = 0; i < bigC; i++)
            one += i % 2 == 0 ? "#" : ".";
        for (int i = 0; i < bigC; i++)
            two += i % 2 == 0 ? "." : "#";
        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();
        for (int i = 0; i < bigR; i++)
            mtx[i] = Arrays.copyOf(i % 2 == 0 ? oneArr : twoArr, bigC);
        for (int i = u; i < bigR - d; i++) {
            char[] tmp = sc.getWord().toCharArray();
            for (int j = l; j < bigC - r; j++) {
                mtx[i][j] = tmp[j - l];
            }
        }
        for (int i = 0; i < bigR; i++)
            System.out.println(new String(mtx[i]));
        sc.close();
    }
    
}
