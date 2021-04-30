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

class TakeTwoStones {
    public static void main(String[] args) {
        new TakeTwoStones();
    }

    TakeTwoStones() {
        answer();
    }

    void answer() {
        System.out.println(new java.util.Scanner(System.in).nextInt() % 2 == 0 ? "Bob" : "Alice");
    }
}
