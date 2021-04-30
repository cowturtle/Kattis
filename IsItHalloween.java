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

class IsItHalloween {
    public static void main(String[] args) {
        new IsItHalloween();
    }

    IsItHalloween() {
        answer();
    }

    void answer() {
        System.out.println(yup(new java.util.Scanner(System.in).nextLine()) ? "yup" : "nope");
        
    }

    boolean yup(String s) {
        return s.equals("OCT 31") || s.equals("DEC 25");
    }
}
