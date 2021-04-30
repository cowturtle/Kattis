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

class OneChickenPerPerson {
    public static void main(String[] args) {
        new OneChickenPerPerson();
    }

    OneChickenPerPerson() {
        answer();
    }

    void answer() {
        int n = 0;
        System.out.println("Dr. Chaz " + 
            ((n = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).reduce((x,y) -> y - x).getAsInt()) < 0
                            ? "needs " + Math.abs(n) + " more piece" + (Math.abs(n) == 1 ? "" : "s") + " of chicken!"
                            : "will have " + Math.abs(n) + " piece" + (Math.abs(n) == 1 ? "" : "s") + " of chicken left over!"));
    }
}
