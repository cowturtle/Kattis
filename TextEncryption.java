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

class TextEncryption {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            char[] inArr = br.readLine().replaceAll("\\s+", "").toUpperCase().toCharArray();
            if (inArr.length < n) {
                sb.append(new String(inArr));
            } else {
                char[] outArr = new char[inArr.length];
                int j = 0, k = 0;
                for (int i = 0; i < inArr.length; i++) {
                    outArr[j] = inArr[i];
                    j += n;
                    if (j >= inArr.length) 
                        j = ++k % inArr.length;
                }
                sb.append(new String(outArr));
            }
            sb.append("\n");
            n = Integer.parseInt(br.readLine());
        }
        System.out.print(sb.toString());
        br.close();
    }
    
}
