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

class BatterUp {

    public static void main(String[] args) {
        new BatterUp();
    }

    BatterUp() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        System.out.println(
            java.util.stream.IntStream.range(0, n)
                .mapToDouble(x -> sc.getDouble())
                .filter(x -> x >= 0)
                .average()
                .getAsDouble());
        // sc.close();
    }

}
