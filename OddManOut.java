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

class OddManOut {
    public static void main(String[] args) {
        new OddManOut();
    }

    OddManOut() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int c = 1;
        while (c <= n) {
            sc.nextLine();
            int[] arr = Arrays.stream(
                    sc.nextLine().split("\\s"))
                    .mapToInt(x -> Integer.parseInt(x))
                    .toArray();
            Arrays.sort(arr);
            System.out.println("Case #" + c + ": " + findLone(arr));
            c++;
        }

    }

    int findLone(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                if (arr[i + 1] == arr[i + 2]) {
                    return arr[i];
                }
                return arr[i + 1];
            }
        }
        return arr[arr.length - 1];
    }
}
