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

class Pot {

    public static void main(String[] args) {
        new Pot();
    }

    Pot() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int x = sc.nextInt();
            int pot = x % 10;
            x /= 10;
            sum += (int) Math.pow(x, pot);
            n--;
        }
        sc.close();
        System.out.println(sum);
    }

}
