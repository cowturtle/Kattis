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

class PlayfairCipher {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        char[][] table = createTable(br.readLine());
        char[] msg = prepareMessage(br.readLine());
        out.println(encrypt(table, msg));
        out.close();
        br.close();        
    }

    static String encrypt(char[][] table, char[] msg) {
        for (int i = 0; i < msg.length; i += 2) {
            int[] a = getRowColumn(table, msg[i]);
            int[] b = getRowColumn(table, msg[i + 1]);
            int arow = a[0], acol = a[1];
            int brow = b[0], bcol = b[1];
            if (arow == brow) {
                msg[i] = table[arow][(acol + 1) % 5];
                msg[i + 1] = table[brow][(bcol + 1) % 5];
            } else if (acol == bcol) {
                msg[i] = table[(arow + 1) % 5][acol];
                msg[i + 1] = table[(brow + 1) % 5][bcol];
            } else {
                msg[i] = table[arow][bcol];
                msg[i + 1] = table[brow][acol];
            }
        }
        return new String(msg).toUpperCase();
    }

    static int[] getRowColumn(char[][] table, char c) {
        int i = 0, j = 0;
        while (i < 5 && table[i][j] != c) {
            j++;
            if (j == 5) {
                i++;
                j = 0;
            }
        }
        return new int[] {i, j};
    }

    static char[] prepareMessage(String msg) {
        msg = msg.replaceAll("\\s+", "");
        ArrayList<Character> tmp = new ArrayList<>();
        for (int i = 0; i < msg.length(); i++) {
            if (i == msg.length() - 1) {
                tmp.add(msg.charAt(i));
                tmp.add('x');
            } else {
                char a = msg.charAt(i), b = msg.charAt(i + 1);
                tmp.add(a);
                if (a == b) {
                    tmp.add('x');
                } else {
                    tmp.add(b);
                    i++;
                }
            }
        }
        char[] encrypt = new char[tmp.size()];
        for (int i = 0; i < tmp.size(); i++)
            encrypt[i] = tmp.get(i);
        return encrypt;
    }

    static char[][] createTable(String key) {
        char[][] table = new char[5][5];
        boolean[] letters = new boolean[26];
        letters[16] = true; // q
        Object[] tmp = Arrays.stream(key.split("")).filter(x -> !x.equals(" ")).distinct().toArray();
        int i = 0, j = 0;
        for (Object o : tmp) {
            table[i][j] = String.valueOf(o).charAt(0);
            letters[table[i][j] - 97] = true;
            j++;
            if (j == 5) {
                i++;
                j = 0;
            }
        }
        for (int k = 0; k < letters.length; k++) {
            if (!letters[k]) {
                table[i][j] = (char) (k + 97);
                j++;
                if (j == 5) {
                    i++;
                    j = 0;
                    if (i == 5) break;
                }
            }
        }
        // for (int x = 0; x < 5; x++) {
        //     for (int y = 0; y < 5; y++) {
        //         System.out.print(table[x][y] + " ");
        //     }
        //     System.out.println();
        // }            
        return table;
    }

}
