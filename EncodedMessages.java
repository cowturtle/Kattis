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

class EncodedMessages {
    
    public static void main(String[] args) {
        new EncodedMessages();
    }

    EncodedMessages() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        while (n-- > 0) {
            System.out.println(decipher(sc.getWord()));
        }
        // sc.close();
    }

    String decipher(String encoded) {
        char[][] tile = writeTile(encoded);
        decipherTile(tile);
        return readTile(tile);
    }

    String readTile(char[][] tile) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tile.length; i++) {
            for (int j = 0; j < tile.length; j++) {
                sb.append(tile[i][j]);
            }
        }
        return sb.toString();
    }

    void decipherTile(char[][] tile) {
        // 4 4 > 0 4
        // 3 4 > 0 3
        // 2 4 > 0 2
        // 1 4 > 0 1 
        for (int i = 0; i < tile.length / 2; i++) {
            for (int j = i; j < tile.length - 1 - i; j++) {
                char temp = tile[j][i]; // top left
                tile[j][i] = tile[i][tile.length - 1 - j]; // top left < top right

                tile[i][tile.length - 1 - j] 
                    = tile[tile.length - 1 - j][tile.length - 1 - i]; // top right < bottom right
                
                tile[tile.length - 1 - j][tile.length - 1 - i] 
                    = tile[tile.length - 1 - i][j]; // bottom right < bottom left
                
                tile[tile.length - 1 - i][j] = temp; // bottom left < temp

            }
        }
    }

    char[][] writeTile(String encoded) {
        int sqLength = getSquareLength(encoded);
        char[][] tile = new char[sqLength][sqLength];
        int x = 0;
        for (int i = 0; i < sqLength; i++) {
            for (int j = 0; j < sqLength; j++) {
                tile[i][j] = encoded.charAt(x);
                x++;
            }
        }
        return tile;
    } 

    int getSquareLength(String s) {
        return (int) Math.sqrt(s.length());
    }

}
