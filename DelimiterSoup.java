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

class DelimiterSoup {
    
    public static void main(String[] args) {
        new DelimiterSoup();
    }

    DelimiterSoup() {
        answer();
    }

    void answer() { 
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.nextLine());
        char[] arr = sc.nextLine().toCharArray();
        System.out.println(check(arr));
        sc.close();
    }

    String check(char[] arr) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == '(' || c == '[' || c == '{') {
                sb.append(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (sb.length() == 0) return c + " " + i;
                char c2 = sb.charAt(sb.length() - 1);
                if ((c == ')' && c2 !='(') 
                    || (c == ']' && c2 !='[')
                    || (c == '}' && c2 !='{')) return c + " " + i;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return "ok so far";
    }

}
