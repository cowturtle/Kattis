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

class WeakVertices {
    
    public static void main(String[] args) {
        new WeakVertices();
    }

    WeakVertices() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = -1;
        while ((n = sc.getInt()) != -1) {
            char[][] arr = new char[n][n];           
            for (int i = 0; i < n; i++) 
                for (int j = 0; j < n; j++) 
                    arr[i][j] = sc.getWord().charAt(0);
            for (int i = 0; i < n; i++)
                if (!isTriangle(i, arr)) sb.append(i + " ");
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());        
        sc.close();
    }

    boolean isTriangle(int i, char[][] arr) {
        for (int j = 0; j < arr.length; j++) 
            if (arr[i][j] == '1')
                for (int k = 0; k < arr.length; k++)
                    if (arr[j][k] == '1' && arr[k][i] == '1') 
                        return true;
        return false;
    }
    
}
