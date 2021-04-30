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

class SavingPrincessPeach {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), y = sc.getInt(), distinct = 0;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < y; i++)
            arr[sc.getInt()] = true;
        for (int i = 0; i < n; i++) 
            if (arr[i]) {
                distinct++;
            } else {
                System.out.println(i);
            }
        System.out.printf("Mario got %d of the dangerous obstacles.", distinct);
        sc.close();
    }
    
}
