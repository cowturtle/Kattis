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

class LicenseToLaunch {
    
    public static void main(String[] args) {
        new LicenseToLaunch();
    }

    LicenseToLaunch() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int iter = 0, x = -1, next = 0, min = Integer.MAX_VALUE;
        while (iter < n) {
            if ((next = sc.getInt()) < min) {
                x = iter;
                min = next;
            }
            iter++;
        }
        System.out.println(x);
        // sc.close();
    }   
 
}
