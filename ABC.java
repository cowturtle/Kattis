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

class ABC {
    public static void main(String[] args) {
        new ABC();
    }

    ABC() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(x -> Integer.parseInt(x)).toArray();
        Arrays.sort(arr);
        String s = "";
        for (char c : sc.nextLine().toCharArray()) {
            s += arr[c - 65] + " ";
        }
        System.out.println(s = s.substring(0, s.length()));
        sc.close();

    }
}
