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

class DRMMessages {
    
    public static void main(String[] args) {
        new DRMMessages();
    }

    DRMMessages() {
        answer();
    }

    void answer() { 
        char[] tmp = new java.util.Scanner(System.in).nextLine().toCharArray();
        char[] part1 = Arrays.copyOfRange(tmp, 0, tmp.length / 2);
        char[] part2 = Arrays.copyOfRange(tmp, tmp.length / 2, tmp.length);
        
        rotateChars(part1);
        rotateChars(part2);
        mergeChars(part1, part2);
        System.out.println(java.util.Arrays.toString(part1).replaceAll("[\\[\\],\\s+]",""));
    }

    void rotateChars(char[] part) {
        int rot = 0;
        for (char c : part)
            rot += c;
        rot -= part.length * 65;
        for (int i = 0; i < part.length; i++)
            part[i] = (char) (((part[i] - 65 + rot) % 26) + 65);
    }

    void mergeChars(char[] part1, char[] part2) {
        for (int i = 0; i < part1.length; i++)
            part1[i] = (char) (((part1[i] - 65 + part2[i] - 65) % 26) + 65);
    }
    
}
