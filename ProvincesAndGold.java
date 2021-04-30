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

class ProvincesAndGold {
    
    public static void main(String[] args) {
        new ProvincesAndGold();
    }

    ProvincesAndGold() {
        answer();
    }

    void answer() {
        int[] arr = java.util.Arrays.stream(
                        new java.util.Scanner(System.in)
                        .nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt).toArray();
        System.out.println(
            check(
                java.util.stream.IntStream
                    .rangeClosed(1, 3)
                    .map(x -> arr[x - 1] * (4 - x))
                    .reduce(0, (x, y) -> x + y)));
    }   

    String check(int total) {
        StringBuffer sb = new StringBuffer();
        if (total >= 8) {
            sb.append("Province");
        } else if (total >= 5) {
            sb.append("Duchy");
        } else if (total >= 2) {
            sb.append("Estate");
        }

        if (total >= 2) {
            sb.append(" or ");
        }

        if (total >= 6) {
            sb.append("Gold");
        } else if (total >= 3) {
            sb.append("Silver");
        } else {
            sb.append("Copper");
        }

        return sb.toString();
    }
 
}
