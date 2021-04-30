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

class Railroad {
    
    public static void main(String[] args) {
        new Railroad();
    }

    Railroad() {
        answer();
    }

    void answer() { 
        System.out.println(work(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    String work(int[] arr) {
        if (arr[1] % 2 == 0) return "possible";
        return "impossible";
    }

}
