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

class WERTYU {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> hmap = new HashMap<>();

        hmap.put(' ', ' ');

        hmap.put('=', '-');
        hmap.put('-', '0');
        hmap.put('0', '9');
        hmap.put('9', '8');
        hmap.put('8', '7');
        hmap.put('7', '6');
        hmap.put('6', '5');
        hmap.put('5', '4');
        hmap.put('4', '3');
        hmap.put('3', '2');
        hmap.put('2', '1');
        hmap.put('1', '1');

        hmap.put('\\',']');
        hmap.put(']','[');
        hmap.put('[','P');
        hmap.put('P','O');
        hmap.put('O','I');
        hmap.put('I','U');
        hmap.put('U','Y');
        hmap.put('Y','T');
        hmap.put('T','R');
        hmap.put('R','E');
        hmap.put('E','W');
        hmap.put('W','Q');
        hmap.put('Q','Q');

        hmap.put('\'',';');
        hmap.put(';','L');
        hmap.put('L','K');
        hmap.put('K','J');
        hmap.put('J','H');
        hmap.put('H','G');
        hmap.put('G','F');
        hmap.put('F','D');
        hmap.put('D','S');
        hmap.put('S','A');
        hmap.put('A','A');

        hmap.put('/','.');
        hmap.put('.',',');
        hmap.put(',','M');
        hmap.put('M','N');
        hmap.put('N','B');
        hmap.put('B','V');
        hmap.put('V','C');
        hmap.put('C','X');
        hmap.put('X','Z');
        hmap.put('Z','Z');

        while (sc.hasNextLine()) {
            char[] arr = sc.nextLine().toCharArray();
            for (int i = 0; i < arr.length; i++) 
                arr[i] = hmap.get(arr[i]);
            System.out.println(new String(arr));
        }
        sc.close();
        
    }
    
}
