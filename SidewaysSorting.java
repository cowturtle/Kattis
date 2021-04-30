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

class SidewaysSorting {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        Comparator<String> com = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.toLowerCase().compareTo(s2.toLowerCase());
            }
        };
        StringBuilder sb = new StringBuilder();
        int r = 0, c = 0;
        while ((r = sc.getInt()) != 0 && (c = sc.getInt()) != 0) {
            char[][] arr = new char[r][c];
            for (int i = 0; i < r; i++)
                arr[i] = sc.getWord().toCharArray();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < c; i++) {
                String s = "";
                for (int j = 0; j < r; j++)  {
                    s += arr[j][i];
                }     
                list.add(s);
            }
            Collections.sort(list, com);
            arr = new char[c][r];
            for (int i = 0; i < c; i++)
                arr[i] = list.get(i).toCharArray();

            for (int i = 0; i < r; i++) {
                String s = "";
                for (int j = 0; j < c; j++)  {
                    s += arr[j][i];
                }     
                sb.append(s);
                sb.append("\n");
                sb.append("\n");
            }
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
