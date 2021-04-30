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

class EbAltoSaxophonePlayer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        char[][] notes = new char[][] {
            //    1   2   3   4   5   6   7   8   9   10
            {'c','0','1','1','1','0','0','1','1','1','1'},
            {'d','0','1','1','1','0','0','1','1','1','0'},
            {'e','0','1','1','1','0','0','1','1','0','0'},
            {'f','0','1','1','1','0','0','1','0','0','0'},
            {'g','0','1','1','1','0','0','0','0','0','0'},
            {'a','0','1','1','0','0','0','0','0','0','0'},
            {'b','0','1','0','0','0','0','0','0','0','0'},
            {'C','0','0','1','0','0','0','0','0','0','0'},
            {'D','1','1','1','1','0','0','1','1','1','0'},
            {'E','1','1','1','1','0','0','1','1','0','0'},
            {'F','1','1','1','1','0','0','1','0','0','0'},
            {'G','1','1','1','1','0','0','0','0','0','0'},
            {'A','1','1','1','0','0','0','0','0','0','0'},
            {'B','1','1','0','0','0','0','0','0','0','0'}
        };
        while (n-- > 0) {
            String s = sc.nextLine();
            int[] fingers = new int[11];
            if (s.length() != 0) {
                char[] arr = s.toCharArray();
                char[] prev = new char[11];
                Arrays.fill(prev, '0');
                for (char c : arr)
                    for (char[] note : notes)
                        if (note[0] == c) {
                            for (int i = 1; i < 11; i++)
                                if (prev[i] == '0' && note[i] == '1')
                                    fingers[i]++;
                            prev = note;
                            break;
                        }         
            }
            sb.append(Arrays.toString(fingers).replaceAll("[\\]\\[,]","").substring(2));
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }    

}
