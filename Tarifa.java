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

class Tarifa {

    Tarifa() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = sc.nextInt(), count = x;
        while (n > 0) {
            n--;
            count += x - sc.nextInt();
        }
        System.out.println(count);
    }
}
