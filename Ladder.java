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

class Ladder {
    public static void main(String[] args) {
        new Ladder();
    }

    Ladder() {
        answer();
    }

    void answer() {
        System.out.println(
            java.util.Arrays.stream(
                        new java.util.Scanner(System.in).nextLine().split("\\s"))
                        .mapToInt(x -> Integer.parseInt(x))
                        .reduce((x,y) -> (int) Math.ceil(x / Math.sin(y * Math.PI / 180)))
                        .getAsInt());      
    }
}
