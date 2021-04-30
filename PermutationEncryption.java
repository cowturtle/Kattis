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

class PermutationEncryption {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[] key = new int[n];
            for (int i = 0; i < n; i++)
                key[i] = sc.nextInt() - 1;
            sc.nextLine();
            char[] msg = sc.nextLine().toCharArray();
            char[] encrypt = new char[(int) (Math.ceil(msg.length / (double) n) * n)];
            Arrays.fill(encrypt, ' ');
            for (int i = 0; i < msg.length; i += n) 
                for (int j = 0; j < n; j++) 
                    if (i + key[j] < msg.length)
                        encrypt[i + j] = msg[i + key[j]]; 
            sb.append("'");
            sb.append(new String(encrypt));
            sb.append("'");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
