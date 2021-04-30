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

class NastyHacks {
    public static void main(String[] args) {
        new NastyHacks();
    }

    NastyHacks() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        java.util.stream.IntStream.range(0, sc.getInt())
                        .mapToObj(x -> {
                            int v = sc.getInt() - (sc.getInt() - sc.getInt());
                            if (v < 0) {
                                return "advertise";
                            } else if (v > 0) {
                                return "do not advertise";
                            }
                            return "does not matter";
                        })
                        .forEach(System.out::println);
        // sc.close();
    }
}
