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

class MosquitoMultiplication {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            int m = sc.getInt(), p = sc.getInt(), l = sc.getInt(), e = sc.getInt(), r = sc.getInt(), s = sc.getInt(), n = sc.getInt();
            while (n-- > 0) {
                int tmpM = p / s; // pupae that survived become mosquitos :(
                int tmpP = l / r; // larvae that survived become pupae :/
                int tmpL = m * e; // mosquito all give birth to one egg each :|
                m = tmpM;
                p = tmpP;
                l = tmpL;
            }
            sb.append(m);
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
