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

class R2 {
    public static void main(String[] args) {
        new R2();
    }

    R2() {
        answer();
    }

    void answer() {
        String[] sarr = new java.util.Scanner(System.in).nextLine().split(" ");
        System.out.println(Integer.parseInt(sarr[1]) * 2 - Integer.parseInt(sarr[0]));
    }
}
