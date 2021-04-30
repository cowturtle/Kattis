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

class Datum {
    
    public static void main(String[] args) {
        new Datum();
    }

    Datum() {
        answer();
    }

    static int[] daysOfMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    void answer() { 
        System.out.println(
            getDay(
                java.util.Arrays.stream(
                    new java.util.Scanner(System.in).nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray()));
    }

    String getDay(int[] arr) {
        int total = arr[0];

        for (int i = 1; i < arr[1]; i++) {
            total += daysOfMonth[i];
        }
        return translate(total % 7);
    }

    String translate(int i) {
        switch (i) {
            case 0: return "Wednesday";
            case 1: return "Thursday";
            case 2: return "Friday";
            case 3: return "Saturday";
            case 4: return "Sunday";
            case 5: return "Monday";
            case 6: return "Tuesday";
            default: return "Someday...";
        }
    }

}
