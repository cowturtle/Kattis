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

class HangingOutOnTheTerrace {
    public static void main(String[] args) {
        new HangingOutOnTheTerrace();
    }

    HangingOutOnTheTerrace() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] lx = java.util.Arrays.stream(
                            sc.nextLine()
                            .split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int curr = 0, count = 0;
        while (lx[1] > 0) {
            lx[1]--;
            String[] s = sc.nextLine().split("\\s+");
            int y = Integer.parseInt(s[1]);
            if (s[0].equals("enter")) {
                if (curr + y <= lx[0]) {
                    curr += y;
                } else {
                    count ++;
                }
            } else {
                curr -= y;
            }
            // System.out.println(curr);
        }
        System.out.println(count);
        sc.close();
    }

}
