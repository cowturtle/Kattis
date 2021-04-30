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

class BrokenSwords {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int[] slats = new int[4];
        int n = sc.getInt();
        while (n-- > 0) {
            char[] arr = sc.getWord().toCharArray();
            for (int i = 0; i < 4; i++)
                if (arr[i] == '0') slats[i]++;
        }
        int tb = slats[0] + slats[1];
        int lr = slats[2] + slats[3];
        int made = tb > lr ? lr / 2 : tb / 2;
        lr -= made * 2;
        tb -= made * 2;
        System.out.printf("%d %d %d\n", made, tb, lr);
        sc.close();
    }
    
}
