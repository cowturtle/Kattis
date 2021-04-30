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

class HelpAPhDCandidateOut {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            String s = sc.getWord();
            if (s.contains("+")) {
                int tots = 0;
                int[] tmp = java.util.Arrays.stream(s.split("\\+")).mapToInt(Integer::parseInt).toArray();
                for (int i = 0; i < tmp.length; i++)
                    tots += tmp[i];
                sb.append(tots);
            } else sb.append("skipped");
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
