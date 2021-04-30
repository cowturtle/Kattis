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

class ChartingProgress {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("")) {
                action(al, sb);
            } else {
                al.add(s);
            }                     
        }
        action(al, sb);
        System.out.print(sb.toString());
        sc.close();
    }
    
    static void action(ArrayList<String> al, StringBuilder sb) {
        char[][] mtx = new char[al.size()][];
        for (int i = 0; i < al.size(); i++)
            mtx[i] = al.get(i).toCharArray();
        int[] arr = new int[mtx[0].length];
        for (int i = 0; i < mtx[0].length; i++)
            for (int j = 0; j < mtx.length; j++)
                if (mtx[j][i] == '*') {
                    arr[i] = mtx.length - 1 - j;
                    break;
                }
        Arrays.sort(arr);
        for (int i = 0; i < mtx[0].length; i++)
            for (int j = 0; j < mtx.length; j++)
                    mtx[j][i] = arr[i] == j ? '*' : '.';
        for (int i = mtx.length - 1; i >= 0; i--)
            sb.append(new String(mtx[i])).append("\n");
        sb.append("\n");
        al.clear();
    }

}
