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

class Prva {
    
    public static void main(String[] args) {
        new Prva();
    }

    Prva() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt();
        char[][] arr = new char[r][c];
        for (int i = 0; i < r; i++)
            arr[i] = sc.getWord().toCharArray();

        ArrayList<String> al = addWords(arr);

        // System.out.println(al.toString());
        System.out.println(Collections.min(al));
        
        sc.close();
    }

    ArrayList<String> addWords(char[][] arr) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String tmp = "";
            for (int j = 0; j < arr[i].length; j++) {
                tmp += arr[i][j];
            }
            checkInput(tmp, al);
        }
        for (int i = 0; i < arr[0].length; i++) {
            String tmp = "";           
            for (int j= 0; j < arr.length; j++) {
                tmp += arr[j][i];
            }
            checkInput(tmp, al); 
        }
        return al;
    }
    
    void checkInput(String tmp, ArrayList<String> al) {
        String[] tmp2 = tmp.split("#");
        for (int i = 0; i < tmp2.length; i++) {
            if (tmp2[i].length() >= 2) al.add(tmp2[i]);
        }
    }

}
