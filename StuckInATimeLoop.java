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

class StuckInATimeLoop {
    public static void main(String[] args) {
        new StuckInATimeLoop();
    }

    StuckInATimeLoop() {
        answer();
    }

    void answer() {
        java.util.stream.IntStream
            .iterate(1, x -> x + 1)
            .limit(new java.util.Scanner(System.in).nextInt())
            .mapToObj(x -> x + " Abracadabra")
            .forEach(System.out::println);
    }
}
