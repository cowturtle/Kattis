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

class TheWeightOfWords {

    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int l = arr[0], w = arr[1];
        if (l * 26 < w || l > w) {
            System.out.println("impossible");
        } else {
            char[] word = new char[l];
            Arrays.fill(word, 'a');
            int i = l;
            while (i < w) {
                for (int j = 0; j < l && i < w; j++, i++)
                    word[j]++;
            }
            System.out.println(new String(word));
        }
    }

}
