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

class SecretMessage {
    
    public static void main(String[] args) {
        new SecretMessage();
    }

    SecretMessage() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            char[] cipher = sc.getWord().toCharArray();
            int len = (int) Math.ceil(Math.sqrt(cipher.length));
            char[][] map = new char[len][len];
            int iter = 0;
            for (int i = 0; i < len; i++) 
                for (int j = 0; j < len; j++) 
                    map[i][j] = iter < cipher.length ? cipher[iter++] : '*';      
            // for (int i = 0; i < len / 2; i++) {
            //     for (int j = 0; j < len / 2; j++) {
            //         char temp = map[i][j];
            //         map[i][j] = map[len - 1 - j][i];
            //         map[len - 1 - j][i] = map[len - 1 - i][len - 1 - j];
            //         map[len - 1 - i][len - 1 - j] = map[j][len - 1 - i];
            //         map[j][len - 1 - i] = temp;
            //     }
            // }
            // for (int i = 0; i < len; i++) {
            //     for (int j = 0; j < len; j++) {
            //         sb.append(map[i][j]);
            //     }
            // } 
            for (int i = 0; i < len; i++) {
                for (int j = len - 1; j >= 0; j--) {
                    sb.append(map[j][i]);
                }
            }              
            sb.append("\n");       
        }
        System.out.println(sb.toString().replaceAll("[*]", ""));
        sc.close();
    }   

}
