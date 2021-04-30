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

class QuadrantSelection {
    void answer() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        String print = "";
        if (x > 0) {
            if (y > 0) {
                print = "1";
            } else {
                print = "4";
            }
        } else {
            if (y > 0) {
                print = "2";
            } else {
                print = "3";
            }
        }
        System.out.println(print);
    }
}
