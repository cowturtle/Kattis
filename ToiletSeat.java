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

class ToiletSeat {
    
    public static void main(String[] args) {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        int up = 0, down = 0, like = 0;

        for (int i = 2; i < arr.length; i++) 
            if (arr[i] == 'D') up+= 2;
        if (arr[0] == 'D') {
            up += 1;
        } 
        if (arr[0] == 'U' && arr[1] == 'D') {
            up += 2;
        }

        for (int i = 2; i < arr.length; i++) 
            if (arr[i] == 'U') down+= 2;
        if (arr[0] == 'U') {
            down += 1;
        } 
        if (arr[0] == 'D' && arr[1] == 'U') {
            down += 2;
        }

        char curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (curr != arr[i]) like++;
            curr = arr[i];
        }

        System.out.printf("%d\n%d\n%d\n", up, down, like);
    }
    
}
