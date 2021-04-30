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

class Trik {
    public static void main(String[] args) {
        new Trik();
    }

    Trik() {
        answer();
    }

    void answer() {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        char[] ball = new char[] {'x','0','0'};
        for (char c : arr) {
            if (c == 'A') {
                swap(ball, 0, 1);
            } else if (c == 'B') {
                swap(ball, 1, 2);
            } else {
                swap(ball, 0, 2);
            }
        }
        int z = -1;
        for (z = 1; z < ball.length; z++) {
            if (ball[z - 1] == 'x') break;
        }
        System.out.println(z);
    }

    void swap(char[] ball, int p1, int p2) {
        char temp = ball[p1];
        ball[p1] = ball[p2];
        ball[p2] = temp;
    }
    
}
