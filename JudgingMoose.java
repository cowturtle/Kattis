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

class JudgingMoose {
    public static void main(String[] args) {
        new JudgingMoose();
    }

    JudgingMoose() {
        answer();
    }

    void answer() {
        int[] arr = java.util.Arrays.stream(
            new java.util.Scanner(System.in)
            .nextLine().split("\\s"))
            .mapToInt(x -> Integer.parseInt(x))
            .toArray();
        String print = "";
        if (arr[0] == 0 && arr[1] == 0) {
            print = "Not a moose";
        } else if (arr[0] == arr[1]) {
            print = "Even " + (arr[0] * 2);
        } else {
            int x = (int) Math.max(arr[0], arr[1]);
            print = "Odd " + (x * 2);
        }
        System.out.println(print);
    }
}
