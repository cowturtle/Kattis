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

class Faktor {
    public static void main(String[] args) {
        new Faktor();
    }

    Faktor() {
        answer();
    }

    void answer() {
        System.out.println(java.util.Arrays.stream(
                        new java.util.Scanner(System.in)
                        .nextLine()
                        .split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .reduce((x,y) -> x * (y - 1) + 1)
                        .getAsInt());
    }
    
}
