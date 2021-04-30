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

class IRepeatMyself {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s = sc.nextLine();
            int len = s.length();
            int i = 1;
            for (; i <= len; i++) 
                if (s.equals(s.substring(0, i).repeat((len / i) + 1).substring(0, len))) break;              
            sb.append(i);
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
