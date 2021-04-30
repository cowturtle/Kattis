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

class WhatDoesTheFoxSay {
    
    public static void main(String[] args) {
        new WhatDoesTheFoxSay();
    }

    WhatDoesTheFoxSay() {
        answer();
    }

    void answer() { 
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine(), tmp = "";
            while (!(tmp = sc.nextLine()).equals("what does the fox say?")) {
                String[] arr = tmp.split("\\s+");
                s = s.replaceAll("\\b" + arr[arr.length - 1] + "\\b", "");
            }
            System.out.println(s.replaceAll("\\s+", " ").trim());
        }
        sc.close();
    }

}
