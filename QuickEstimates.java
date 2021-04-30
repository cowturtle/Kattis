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

class QuickEstimates {
    
    public static void main(String[] args) {
        new QuickEstimates();
    }

    QuickEstimates() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            System.out.println(sc.nextLine().length());
        }
    }

}
