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

class HarshadNumbers {
    
    public static void main(String[] args) {
        new HarshadNumbers();
    }

    HarshadNumbers() {
        answer();
    }

    void answer() {
        System.out.println(getSmallestHarshadNumber(new java.util.Scanner(System.in).nextInt()));
    }

    int getSmallestHarshadNumber(double n) {
        for (int i = (int) n; i <= Integer.MAX_VALUE; i++) {
            if (isHarshadNumber(i)) return i;
        }
        return -1;
    }

    boolean isHarshadNumber(double n) {
        double temp = n, sum = 0;
        while (temp > 0) {
            sum += ((int) temp) % 10;
            temp /= 10;
        }
        double res = n / sum;
        return res == Math.floor(res); 
    }

}
