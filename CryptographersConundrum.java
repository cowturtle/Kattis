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

class CryptographersConundrum {
    
    public static void main(String[] args) {
        new CryptographersConundrum();
    }

    CryptographersConundrum() {
        answer();
    }

    static final String DUDE_NAME = "PER";

    void answer() { 
        char[] cipher = new java.util.Scanner(System.in).nextLine().toCharArray();
        char[] test = DUDE_NAME.repeat(cipher.length / 3).toCharArray();
        int x = 0;
        for (int i = 0; i < cipher.length; i++) {
            x += cipher[i] == test[i] ? 0 : 1;
        }
        System.out.println(x);
    }

}
