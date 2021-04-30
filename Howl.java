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

class Howl {
    
    public static void main(String[] args) {
        // System.out.println(new java.util.Scanner(System.in).nextLine() + "O"); // 0.35
        // System.out.println(new Kattio(System.in).getWord() + "O"); // 0.22
        // System.out.println(new Kattio(System.in).getWord().concat("O")); // 0.20
        System.out.println(new String(new Kattio(System.in).getWord()).concat("O")); // 0.19
    }
    
}
