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

class BusNumbers {
    public static void main(String[] args) {
        new BusNumbers();
    }

    BusNumbers() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = Arrays.stream(sc.nextLine().split("\\s"))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();
        int[] stops = new int[1001];
        String print = "";
        for (int i = 0; i < arr.length; i++) {
            stops[arr[i]] = 1;
        }
        int con = 0;
        for (int i = 0; i < stops.length; i++) {
            if (stops[i] == 1) {
                if (i < stops.length - 1 && stops[i + 1] == 1) {
                    con += 1;
                } else {
                    if (con == 0) {
                        print += i + " ";
                    } else if (con == 1) {
                        print += (i - 1) + " " + i + " ";
                    } else {
                        print += (i - con) + "-" + i + " ";
                    }
                    con = 0;
                }

            }
        }
        System.out.println(print);
    }
}
