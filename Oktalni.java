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

class Oktalni {
    
    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();
        while (s.length() % 3 != 0) 
            s = "0".concat(s);
        for (int i = 0; i < s.length(); i += 3) 
            sb.append(map(s.substring(i, i + 3)));
        System.out.println(sb.toString());
    }

    static char map(String s) {
        switch(s) {
            case "000" : return '0';
            case "001" : return '1';
            case "010" : return '2';
            case "011" : return '3';
            case "100" : return '4';
            case "101" : return '5';
            case "110" : return '6';
            case "111" : return '7';
            default: return ' ';
        }
    }    
}
