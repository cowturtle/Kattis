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

class MusicalNotation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] arr = filterString(sc.nextLine());
        
        char[][] sheet = new char[14][arr.length];
        fillSheet(sheet, arr.length);
        for (int i = 0; i < arr.length; i++) 
            if (Character.isAlphabetic(arr[i]))
                sheet[foo(arr[i])][i] = '*';
        for (int i = 0; i < sheet.length; i++) 
            System.out.printf("%s: %s\n", bar(i), new String(sheet[i]));
        sc.close();
    }

    static char[] filterString(String s) {
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && Character.isAlphabetic(s.charAt(i)) && Character.isDigit(s.charAt(i + 1))) {
                int lim = Character.getNumericValue(s.charAt(i + 1));
                for (int j = 0; j < lim; j++) 
                    out += s.charAt(i);
            } else if (!Character.isDigit(s.charAt(i))) {
                out += s.charAt(i);
            }
        }
        return out.toCharArray();
    }

    static void fillSheet(char[][] sheet, int n) {
        char[] line = "-".repeat(n).toCharArray();
        char[] space = " ".repeat(n).toCharArray();
        sheet[1] = Arrays.copyOf(line, n); 
        sheet[3] = Arrays.copyOf(line, n); 
        sheet[5] = Arrays.copyOf(line, n); 
        sheet[7] = Arrays.copyOf(line, n);  
        sheet[9] = Arrays.copyOf(line, n); 
        sheet[13] = Arrays.copyOf(line, n);  
        sheet[0] = Arrays.copyOf(space, n);
        sheet[2] = Arrays.copyOf(space, n);
        sheet[4] = Arrays.copyOf(space, n);
        sheet[6] = Arrays.copyOf(space, n);
        sheet[8] = Arrays.copyOf(space, n);
        sheet[10] = Arrays.copyOf(space, n);
        sheet[11] = Arrays.copyOf(space, n);
        sheet[12] = Arrays.copyOf(space, n);
    }

    static String bar(int i) {
        switch(i) {
            case 0: return "G";
            case 1: return "F";
            case 2: return "E";
            case 3: return "D";
            case 4: return "C";
            case 5: return "B";
            case 6: return "A";
            case 7: return "g";
            case 8: return "f";
            case 9: return "e";
            case 10: return "d";
            case 11: return "c";
            case 12: return "b";
            case 13: return "a";
            default: return "";
        }
    }

    static int foo(char c) {
        switch(c) {
            case 'G': return 0;
            case 'F': return 1;
            case 'E': return 2;                                                 
            case 'D': return 3;
            case 'C': return 4;                                                          
            case 'B': return 5;
            case 'A': return 6;                                                          
            case 'g': return 7;
            case 'f': return 8;                                                           
            case 'e': return 9;
            case 'd': return 10;                                                           
            case 'c': return 11;                                                           
            case 'b': return 12;                                                           
            case 'a': return 13;
            default: return -1;
        }
    }
    
}
