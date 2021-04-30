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

class Pet {

    public static void main(String[] args) {
        new Pet();
    }

    Pet() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int max = 0;
        int c = 0;
        while (n <= 5) {
            String[] s = sc.nextLine().split(" ");
            int locl = 0;
            for (String b : s) {
                locl += Integer.parseInt(b);
            }
            max = Math.max(locl, max);
            if (max == locl) c = n;
            n++;
        }
        sc.close();
        System.out.println(c + " " + max);
    }

}
