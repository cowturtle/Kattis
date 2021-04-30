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

class Aaah {
    public static void main(String[] args) {
        new Aaah();
    }

    Aaah() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(second.length() > first.length() ? "no" : "go"); 
    }
}
