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

class Sibice {
    public static void main(String[] args) {
        new Sibice();
    }

    Sibice() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        double[] arr = Arrays.stream( 
                        sc.nextLine()
                        .split("\\s"))
                        .mapToDouble(x -> Double.parseDouble(x))
                        .toArray();
        double hyp = Math.sqrt(Math.pow(arr[2],2) + Math.pow(arr[1],2));
        String res = "";
        while (arr[0] > 0) {
            arr[0]--;
            res += (sc.nextInt() <= hyp ? "DA" : "NE") + "\n";
        }
        sc.close();
        System.out.println(res.substring(0, res.length() - 1));
    }
}
