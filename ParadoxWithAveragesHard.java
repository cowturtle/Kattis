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

class ParadoxWithAveragesHard {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int ncs = sc.getInt(), ne = sc.getInt(), funny = 0;
            int[] cs = new int[ncs];
            double csaverage = 0, etotal = 0, eaverage = 0;
            for (int i = 0; i < ncs; i++)
                csaverage += cs[i] = sc.getInt();
            for (int i = 0; i < ne; i++)
                etotal += sc.getInt();
            csaverage /= ncs;
            eaverage = etotal / ne;
            for (int i = 0; i < ncs; i++) {
                double csTmp = ((csaverage * ncs) - cs[i]) / (ncs - 1);
                double eaTmp = (etotal + cs[i]) / (ne + 1);
                if (csTmp > csaverage && eaTmp > eaverage) funny++;
            }
            sb.append(funny).append("\n");
        }  
        System.out.print(sb.toString());
        sc.close();
    }  
    
}
