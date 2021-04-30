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

class PermutedArithmeticSequence {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int nn = sc.getInt();
            int[] nnn = new int[nn];
            for (int nnnn = 0; nnnn < nn; nnnn++) 
                nnn[nnnn] = sc.getInt();
            boolean nnnnnn = checkArithmeticSequence(nnn);
            if (nnnnnn) {
                sb.append("arithmetic"); 
            } else {
                Arrays.sort(nnn);
                if (checkArithmeticSequence(nnn)) {
                    sb.append("permuted arithmetic");
                } else {
                    sb.append("non-arithmetic");
                }
            }
            sb.append("\n");            
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static boolean checkArithmeticSequence(int[] n) {
        int nn = n[0] - n[1];
        for (int i = 0; i < n.length - 1; i++)
            if (nn != n[i] - n[i + 1]) return false;
        return true;
    }
    
}
