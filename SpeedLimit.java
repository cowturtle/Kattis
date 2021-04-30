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

class SpeedLimit {
    public static void main(String[] args) {
        new SpeedLimit();
    }

    SpeedLimit() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = -1;
        while ((n = Integer.parseInt(sc.nextLine())) != -1) {
            int prev = 0;
            int miles = 0;
            while (n > 0) {
                String[] in = sc.nextLine().split(" ");
                miles += Integer.parseInt(in[0]) * (Integer.parseInt(in[1]) - prev);
                prev = Integer.parseInt(in[1]);
                n--;
            }
            al.add(miles);
        }
        al.stream().map(x -> x + " miles").forEach(System.out::println);
    }
}
