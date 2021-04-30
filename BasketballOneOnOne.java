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

class BasketballOneOnOne {
    
    public static void main(String[] args) {
        new BasketballOneOnOne();
    }

    BasketballOneOnOne() {
        answer();
    }

    void answer() {
        int a = 0, b = 0;
        boolean finale = false;
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] == 'A') {
                a += arr[i + 1] - 48;
            } else {
                b += arr[i + 1] - 48;
            }

            if (finale) {
                if (a - b >= 2) {
                    System.out.println('A');
                    break;
                } else if (b - a >= 2) {
                    System.out.println('B');
                    break;
                }
            } else if (a == 10 && b == 10) {
                finale = true;
            } else if (a >= 11 && !finale) {
                System.out.println('A');
                break;
            } else if (b >= 11 && !finale) {
                System.out.println('B');
                break;
            }
        }
    }

}
