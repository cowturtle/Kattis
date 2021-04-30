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

class Okviri {
    
    public static void main(String[] args) {
        new Okviri();
    }

    Okviri() {
        answer();
    }

    void answer() { 
        System.out.println(work(new java.util.Scanner(System.in).nextLine().toCharArray()));
    }

    String work(char[] arr) {
        StringBuffer sb = new StringBuffer();
        // 1 length 5
        // 2 length 9
        // 3 length 13
        // 4 length 17

        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                headTail(sb, arr.length);
            } else if (i % 2 == 0) {
                partial(sb, arr.length);
            } else {
                middle(sb, arr.length, arr);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    void middle(StringBuffer sb, int length, char[] arr) {
        sb.append("#.");
        sb.append(arr[0]);
        sb.append(".#");
        for (int i = 2; i <= length; i++) {
            if ((i + 1) % 3 == 0 || i % 3 == 0) {
                sb.append(".");
                sb.append(arr[i - 1]);
                sb.append(".*");
            } else {
                sb.append(".");
                sb.append(arr[i - 1]);
                sb.append(".#");
            }
        }
        if (length % 3 != 0) {
            sb.deleteCharAt(sb.length()-1);
            sb.append("#");
        }
    }

    void partial(StringBuffer sb, int length) {
        sb.append(".#.#.");
        for (int i = 2; i <= length; i++) {
            if (i % 3 == 0) {
                sb.append("*.*.");
            } else sb.append("#.#.");
        }
    }

    void headTail(StringBuffer sb, int length) {
        sb.append("..#");
        for (int i = 2; i < length; i++) {
            if (i % 3 == 0) {
                sb.append("...*");
            } else sb.append("...#");
        }
        if (length > 1) {
            if (length % 3 == 0) {
                sb.append("...*..");
            } else sb.append("...#..");
        } else sb.append("..");
    }

}
