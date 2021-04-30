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

class RunLengthEncodingRun {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String letter = sc.getWord(), phrase = sc.getWord(), output = "";
        char[] arr = phrase.toCharArray();
        if (letter.equals("E")) {            
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    count++;
                    i++;
                } 
                output += arr[i] + "" + count;
            }
        } else {
            for (int i = 0; i < arr.length; i += 2) {
                int x = Character.getNumericValue(arr[i + 1]);
                for (int j = 0; j < x; j++) 
                    output += arr[i];
            }
        }
        System.out.println(output);
        sc.close();
    }
    
}
