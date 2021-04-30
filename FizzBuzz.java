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

class FizzBuzz {
    void answer() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            String print = "";
            if (i % x != 0 && i % y != 0) {
                print = String.valueOf(i);
            } else {
                if (i % x == 0) {
                    print += "Fizz";
                }
                if (i % y == 0) {
                    print += "Buzz";
                }
            }
            System.out.println(print);
        }
    }
}
